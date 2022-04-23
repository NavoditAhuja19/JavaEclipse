package lec5;

import java.util.Scanner;

public class arr_ip_op2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = takeinput();
		int b[] = takeinput();
		swap(a, b);
		outputdspl(a);
		outputdspl(b);

	}

	public static void swap(int[] arr, int[] arr1) {
	int[] temp;
	temp=arr;
	arr=arr1;
	arr1=temp;
	outputdspl(arr);
	outputdspl(arr1);
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
		System.out.println();
	}
}
