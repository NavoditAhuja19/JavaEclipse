package lec5;

import java.util.Scanner;

public class subsets {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30 };

		outputdspl(a);
		Subsets(a);

	}

	public static void outputdspl(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

		
	}

	public static void Subsets(int[] arr) {
		int limit = (int) Math.pow(2, arr.length);
		for (int i = 0; i < limit; i++) {
			int temp = i;
			for (int j = 0; j < arr.length; j++) {
				int rem = temp % 2;
				temp = temp / 2;
				if (rem != 0)
					System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
}
