package algorithms;

import java.util.Scanner;

public class inverting_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		invert(n);

	}
	public static void invert(long n)
	{
		long num=n;
		long ans=0;
		long mul=1;
		while(n>0)
		{
			long rem,newr;
			if(n==9)
			{
				 rem=n%10;
				n=n/10;
				 newr=rem;
			}
			else
			{
			 rem=n%10;
			n=n/10;
			 newr=9-rem;
			}
			if(newr<rem)
				rem=newr;
			ans=ans+rem*mul;
			mul=mul*10;
			
			
		}
		System.out.println(ans);
	}

}
