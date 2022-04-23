package algorithms;

import java.util.Scanner;

public class aggresive_cows {
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

		int sum = 0;
		int temp2 = arr[0];
		for (int i = 1; i < arr.length; i++)
			sum = sum + (arr[i] - arr[i - 1]);

		int mod = sum / (c - 1);
		int temp = 0, val;
		int cnt = 1;
		int[] abc = new int[st];
		abc[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			val = (arr[i] - temp2);
		if (val > mod) {
				
				if (cnt == st)
					break;
				temp2 = arr[i - 1];

				abc[cnt] = temp2;
			//	System.out.println(abc[cnt]);
				cnt++;
				if (cnt == (c))
					break;

			}
			

		}
		int mind=Integer.MAX_VALUE;
	for(int i=1;i<c;i++)
	{
		int dis=abc[i]-abc[i-1];
		//System.out.println(dis);
		if(mind>dis)
			mind=dis;
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
