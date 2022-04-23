package lec5;

import java.util.Scanner;

public class arr_bsearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40, 50 };
		int b[]=new int[10];
		b[1]=10;
		System.out.println(b[1]);

		outputdspl(a);
		System.out.println("enter item to search");
		int n = scn.nextInt();

		int index = bsearch(a, n);
		System.out.println(index);

	}

	public static void outputdspl(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static int bsearch(int[] arr, int a) {
		int lo = 0;
		int hi = arr.length - 1;

		int mid;
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (a > arr[mid])
				lo = mid + 1;
			else if (a < arr[mid])
				hi = mid - 1;
			else
				return mid;

		}

		return -1;
	}
}
