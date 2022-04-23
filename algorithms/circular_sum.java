package algorithms;

import java.util.Scanner;

public class circular_sum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		int[] abc = new int[t];
		for (int i = 0; i < t; i++) {
			int a[] = takeinput();
			abc[i] = c_sum(a);

		}
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}

	}

	public static int c_sum(int[] arr) {
		int temp = arr[0];
		int sum = 0;
		int pos = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < temp) {
				temp = arr[i];
				pos = i;
			}

		}
		int rot = arr.length - 1 - pos;
		int c;
		c = arr.length - rot;

		rotate(arr, c);
		for (int i = 0; i < arr.length - 1; i++) {
			sum = sum + arr[i];

		}

		return sum;
	}

	public static int[] takeinput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

	public static void rotate(int[] arr, int cnt) {
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j <= arr.length - 2; j++) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}

	}

}
