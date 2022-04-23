package algorithms;

import java.util.Scanner;

public class max_k_swaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		System.out.println(max(arr, 0, k));
	}

	public static int max(char[] arr, int vidx, int k) {

		int max = Integer.parseInt(new String(arr));
		if (k == 0 || vidx == arr.length) {
			return max;
		}
		int restmax = nextmax(arr, vidx);
		for (int i = vidx; i < arr.length; i++) {
			if (arr[vidx] == restmax) {
				return max(arr, vidx + 1, k);
			} else {
				if (arr[i] == restmax) {
					swap(arr, vidx, i);
					int rr = max(arr, vidx + 1, k - 1);
					swap(arr, vidx, i);
					max = Math.max(max, rr);

				}

			}
		}
		return max;

	}

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static char nextmax(char[] arr, int i) {
		char maxchar = arr[i];
		while (i < arr.length) {
			if (maxchar < arr[i])
				maxchar = arr[i];
			i++;
		}
		return maxchar;
	}

}
