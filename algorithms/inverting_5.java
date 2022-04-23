package algorithms;

import java.util.Scanner;

public class inverting_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		invert5(n);

	}
	public static void invert5(long n)
	{
		long num=n;
		long ans=0;
		long mul=1;
		if(n==0)
			ans=5;
		while(n>0)
		{
			long rem;
			 rem=n%10;
			n=n/10;
			if(rem==0)
				rem=5;
			 
			
			ans=ans+rem*mul;
			mul=mul*10;
			
			
		}
	
		System.out.println(ans);
	}

}
