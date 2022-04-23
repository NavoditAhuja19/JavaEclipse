package lec7;

import java.util.Scanner;

public class difference_asciicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		d_ascii(str);

		
	}
	public static void d_ascii(String str)
	{
		char ch,ch1;
		int a;
		String str1="";
		for(int i=1;i<str.length();i++)
		{
			ch=str.charAt(i-1);
			ch1=str.charAt(i);
			a=ch1-ch;
			str1=str1+ch+a;
			
					
		}
		str1=str1+str.charAt(str.length()-1);
		System.out.println(str1);
	}
	

}

