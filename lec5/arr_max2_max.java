package lec5;

import java.util.Scanner;

public class arr_max2_max {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 60, 40, 50 };

		//System.out.println(a.length);
		outputdspl(a);
		int c = max_value(a);
		System.out.println(c);

	}

	public static void outputdspl(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static int max_value(int[] arr) {
		int val = 0;
		int abc = arr[0];
		int pos=0;
		for (int i = 1; i < arr.length; i++) {

			val = arr[i];
			if (val > abc) {
				abc = val;

				pos=i;
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(i!=pos)
			{
				if(arr[i]>max)
				{max=arr[i];}
			}
		}
		

		
		return max;
	}
}
