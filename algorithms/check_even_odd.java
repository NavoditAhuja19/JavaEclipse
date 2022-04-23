package algorithms;

import java.util.Scanner;

public class check_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		int sum_odd=0;
		int sum_even=0;
		int cnt1=1;
		
		while(n>0)
		{
			int rem=n%10;
			if(cnt1%2!=0)
			{
				sum_odd+=rem;}
			else
			{
				sum_even+=rem;
			}
			n=n/10;
			cnt1++;
			
			}
		System.out.println(sum_odd);
		System.out.println(sum_even);
		
		

	}

}
