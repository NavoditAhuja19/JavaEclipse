package algorithms;

import java.util.Scanner;

public class pair_roses {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int a[] = takeinput();
			rose(a);

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

	public static void rose(int[] arr) {
		int n = scn.nextInt();
	
		int temp = Integer.MAX_VALUE;
		int d;
		int posi = 0, posj = 0;
	

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					if ((arr[i] + arr[j] == n)&&i!=j) {

						d = arr[j] - arr[i];
						if (temp > d) {
							temp = d;
							posj = j;
							posi = i;
						}

					}
				}
			}

		}

		System.out.println("Deepak should buy roses whose prices are " + arr[posi] + " and " + arr[posj] + ".");

	}
}
