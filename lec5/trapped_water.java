package lec5;

import java.util.Scanner;

public class trapped_water {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		for (int j = 0; j < t; j++) {
			int a[] = takeinput();
			t_water(a);
		}

	}

	public static int[] takeinput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}
		return arr;
	}

	public static void t_water(int[] arr) {

		int[] leftmax = new int[arr.length];
		int[] rightmax = new int[arr.length];
		leftmax[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
		}
		rightmax[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
		}
		int water = 0;
		for (int i = 1; i < arr.length - 1; i++) {

			water = water + Math.min(leftmax[i], rightmax[i]) - arr[i];

		}
		System.out.println(water);

	}

}
