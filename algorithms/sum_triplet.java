package algorithms;

import java.util.Scanner;

public class sum_triplet {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = takeinput();
		sort(a);

		sum_pair(a);

	}

	public static void sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++)

		{
			for (int j = 0; j < (arr.length - 1); j++) {
				if (arr[j + 1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void sum_pair(int[] arr) {
		int tar = scn.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {

					if (arr[i] + arr[j] + arr[k] == tar) {
					//	if (arr[i] < arr[j] && arr[j] < arr[k]) {

							System.out.println(arr[i] + " and " + arr[j] + " and " + arr[k]);

					//	}
					}

				}

			}
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

}
