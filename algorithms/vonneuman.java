package algorithms;

import java.util.Scanner;

public class vonneuman {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int[] abc = new int[n];
		for(int i=0;i<n;i++)
		{
		int n1 = scn.nextInt();
		abc[i]=binarytodecimal(n1);

		}
		for(int i=0;i<abc.length;i++)
		{
			System.out.println(abc[i]);
		}
	}
		public static int binarytodecimal(int n)
		{
			int ans = 0;
			int mul = 1;
			while (n > 0) {
				int rem = n % 10;
				ans = ans + rem * mul;
				mul = mul * 2;
				n = n / 10;
			}
			return ans;
			
		}
	

}
