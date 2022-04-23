package lec5;

import java.util.Scanner;

public class trapped_water2 {
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

		// int c = max_value1(arr);
		int fact = Integer.MIN_VALUE;
		int value = 1;
		int max_pos = max_value(arr);
		int max_value = arr[max_pos];
		for (int i = 0; i < arr.length; i++) {
			if (i < max_pos) {
				value = (max_pos - i) * arr[i];
			} else if (i > max_pos) {
				value = (i - max_pos) * arr[i];
			}
			if (fact < value)
				fact = value;
		}
		System.out.println(value);

	}

	public static int max_value(int[] arr) {
		int val = 0;
		int abc = arr[0];
		int pos = 0;
		for (int i = 1; i < arr.length; i++) {

			val = arr[i];
			if (val > abc) {
				abc = val;

				pos = i;
			}
		}

		return pos;
	}

}
