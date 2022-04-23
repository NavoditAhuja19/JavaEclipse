package lec5;

import java.util.Scanner;

public class subaarays2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40 };

		outputdspl(a);
		subarrays(a);

	}

	public static void outputdspl(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static void subarrays(int[] arr) {

		for (int i = 0; i <= arr.length - 1; i++) {
			int sum = 0;
			for (int j = i; j <= arr.length - 1; j++) {
				sum += arr[j];
				System.out.println(sum);
			}
			System.out.println();
		}

	}
}
