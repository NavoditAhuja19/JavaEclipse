package algorithms;

import java.util.Scanner;

public class aggresive_cows2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int st = scn.nextInt();
		int c = scn.nextInt();
		int[] a = takeinput(st);
		a_cows(a, st, c);

	}

	public static int[] takeinput(int st) {

		int[] arr = new int[st];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

	public static void a_cows(int[] arr, int st, int c) {
		sort(arr);

		int temp = arr[0];
		int mind = 1;
		int cnt = 0;

		for (int j = 0; j < arr[arr.length - 1]; j++) {
			cnt=0;
			temp=arr[0];
			for (int i = 1; i < st; i++) {
				if (arr[i] - temp >= mind) {
					temp = arr[i];
					cnt++;
				}
			}
			mind++;
			if (cnt <(c-1 )) {
				mind = mind - 2;
				break;
			}

		}

		System.out.println(mind);

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

}
