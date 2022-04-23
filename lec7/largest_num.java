package lec7;

import java.util.Scanner;

public class largest_num {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int[] a = takeinput();
			for (int j = 0; j < a.length; j++) {
				for (int k =0 ; k < a.length-j - 1; k++) {
					if (compare(a[k], a[k + 1]) > 0) {
						int temp = a[k];
						a[k] = a[k + 1];
						a[k + 1] = temp;

					}

				}

			}
			String s1="";
			for(int j=a.length-1;j>=0;j--)
			{
				s1=s1+a[j];
				//System.out.print(a[j]+" ");
			}
		
			System.out.println(s1);
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

	public static int compare(int num1, int num2) {
		String s1 = "" + num1 + num2;
		String s2 = "" + num2 + num1;
		long res1 = Long.parseLong(s1);
		long res2 = Long.parseLong(s2);

		if (res1 >= res2)
			return 1;
		else
			return -1;

	}

}
