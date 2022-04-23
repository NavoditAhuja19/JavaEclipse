package lec5;

import java.util.Scanner;

public class arr_ip_op {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = takeinput();
		outputdspl(a);

	}

	public static int[] takeinput() {
		System.out.println("size ");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

	public static void outputdspl(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
