package lec1;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int i=n*b;
		int j=2;
		while(j<=i)
		{
			if(i%j==0&&j%n==0&&j%b==0)
			{
				System.out.println(j);
			break;
			}
			j=j+1;
		}
	

	}

}
