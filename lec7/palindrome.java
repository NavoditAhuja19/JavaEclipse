package lec7;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();

		boolean b=palindrome(str);
		System.out.println(b);

	}
	public static boolean palindrome(String a)
	{
		int flag=0;
		for(int i=0,j=(a.length()-1);(i<=j);i++,j--)
		{
			if(a.charAt(i)!=a.charAt(j))
			{
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		return true;
		else 
			return false;
		
	}

}

