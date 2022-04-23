package lec7;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		odd_even(str);

		
	}
	public static void odd_even(String str)
	{
		char ch;
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				ch=str.charAt(i);
				ch++;
				
				str1=str1+ch;
			}
			else
			{
				ch=str.charAt(i);
				ch--;
				
			str1=str1+ch;
			}
				
		}
		System.out.println(str1);
	}
	

}

