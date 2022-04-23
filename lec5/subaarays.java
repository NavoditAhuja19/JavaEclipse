package lec5;

import java.util.Scanner;

public class subaarays {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1,0 ,1 ,1 ,0,0,1  };

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

		for (int k = 0; k <= arr.length - 1; k++) {
			for (int i = k; i <= arr.length - 1; i++) {
				for (int j = k; j <= i; j++) {
					System.out.print(arr[j] + " ");
					
				}
				System.out.println();
			}

		}
	}
}
