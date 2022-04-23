package algorithms;

import java.util.Scanner;

public class c_sum2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = takeinput();
		int sum=c_sum(a);
		System.out.println(sum%((int)Math.pow(10, 9)+7)); 
	

	}

	public static int[] takeinput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

	public static int c_sum(int[] arr) {
		int t = scn.nextInt();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		sum+=arr[i];
		sum=sum*((int)Math.pow(2, t));
		return sum;

	}
}
