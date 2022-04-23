package algorithms;

import java.util.Scanner;

public class any_any_conv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int n = scn.nextInt();
		int ans = 0,ans1=0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			ans = ans + rem * mul;
			mul = mul * sb;
			n = n / 10;
		}
		mul=1;
		while(ans>0)
		{
			int rem = ans % db;
			ans1 = ans1 + rem * mul;
			mul = mul * 10;
			ans = ans / db;
			
		}
		System.out.println(ans1);
		

	}

}
