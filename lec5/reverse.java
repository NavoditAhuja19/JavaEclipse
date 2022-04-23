package lec5;

import java.util.Scanner;

public class reverse {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40, 50 };

		outputdspl(a);
		System.out.println("enter rotations");
		int rot = scn.nextInt();
		rot = rot % a.length;
		int c;
		c = a.length - rot;

		rotate(a, c);
		outputdspl(a);

	}

	public static void outputdspl(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

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
