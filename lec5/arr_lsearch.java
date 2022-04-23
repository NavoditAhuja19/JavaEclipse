package lec5;

import java.util.Scanner;

public class arr_lsearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 60, 40, 50 };

		outputdspl(a);
		System.out.println("enter item to search");
		int n = scn.nextInt();

		int index = lsearch(a, n);
		System.out.println(index);

	}

	public static void outputdspl(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static int lsearch(int[] arr, int a) {
		int val = 0;

		for (int i = 0; i < arr.length; i++) {
			val = arr[i];

			if (val == a) {
				return i;
			}
		}
		return -1;
	}
}
