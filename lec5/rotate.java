package lec5;

import java.util.Scanner;

public class rotate {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40, 50,60,70 };

		outputdspl(a);
		reverse(a);
		outputdspl(a);
		
	

	}

	public static void outputdspl(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static void reverse(int[] arr) {
		for(int i=0 , j=arr.length-1;i<arr.length/2||j>=arr.length/2;i++, j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		
		
		
	}
}
