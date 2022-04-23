package lec5;

import java.util.Scanner;

public class inverse {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 0, 4, 2, 1 };

		outputdspl(a);
		int c[] = inverse(a);

		outputdspl(c);

	}

	public static void outputdspl(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static int[] inverse(int[] arr) {
		int pos = 0;
		int[] abc = new int[arr.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			int j = arr[i];
			abc[j] = pos;
			pos++;

		}

		return abc;
	}
}
