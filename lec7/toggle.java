package lec7;

import java.util.Scanner;

public class toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		toggle(str);

		
	}
	public static void toggle(String str)
	{
		char ch,ch1;
		int a;
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
				{
				a=ch-32;
				ch1=(char)a;
				str1=str1+ch1;
				}
			else if(ch>='A'&&ch<='Z')
			{
			a=ch+32;
			ch1=(char)a;
			str1=str1+ch1;
			}
				
					
		}
		System.out.println(str1);
	}
	

}

