package lec5;

import java.util.Scanner;

public class largestsubaarays {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int a[] = takeinput();

			subarrays(a);
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

	public static void subarrays(int[] arr) {

	
		int pos = -1,val=Integer.MIN_VALUE;
		int pos1=-1;
		for (int k = 0; k <arr.length; k++) {
			for (int i = k; i <= arr.length - 1; i++) {
				int cnt = 0, cnt1 = 0;
				for (int j = k; j <= i; j++) {
					if (arr[j] == 1)
						cnt++;
					else
						cnt1++;

					if (cnt1 == cnt)
					{
						pos = (cnt+cnt1-1);
						
					}
					if(pos>val)
					{	val=pos;
					
					pos1=k;}
				}
			

			}
		
		}
		if (val > -1)
			

		{	System.out.println(pos1 + " "+ (val+pos1));
	
		}
		else
			System.out.println("None");

	}
}

