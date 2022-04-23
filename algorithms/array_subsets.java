package algorithms;

import java.util.Scanner;

public class array_subsets {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int arr[] = takeinput(n);

		int target = scn.nextInt();
		int idx = 0;
		int limit = (int) Math.pow(2, arr.length);

		int count = subsets(arr, target, idx, limit, 0);

		System.out.println();
		System.out.println(count);
	}

	public static int[] takeinput(int n) {
		// System.out.println("size ");

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

	public static int subsets(int[] arr, int target, int i, int n, int count) {

		if (i == n)
			return count;
		int temp = i;
		int sum = 0;
		int cnt = 0;

		int[] ar = new int[arr.length];
		for (int j = 0; j < arr.length; j++) {

			int rem = temp % 2;
			temp = temp / 2;
			if (rem != 0) {
				ar[cnt] = arr[j];

				cnt++;
			}
		}
		for (int j = 0; j < ar.length; j++) {
			sum += ar[j];
		}
		if (sum == target) {
			count++;
			for (int j = 0; j < cnt; j++) {
				System.out.print(ar[j] + " ");
			}
			System.out.print(" ");
		}
		count = subsets(arr, target, i + 1, n, count);

		return count;
	}
}
