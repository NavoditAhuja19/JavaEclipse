package algorithms;

import java.util.Scanner;

public class input_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int n1 = scn.nextInt();
		int c;
		int i=1,cnt=1;
		while(cnt<=n)
		{
			c=3*i+2;
			if(c%n1!=0)
			{
				System.out.println(c);
				cnt++;
			}
			i++;
			
		}

	}

}
