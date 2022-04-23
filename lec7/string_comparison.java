package lec7;

import java.util.Scanner;

public class string_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		s_comparison(str);
		scn.close();

		
	}
	public static void s_comparison(String str)
	{
		char ch,ch1;
		int cnt=0,j=0;
		String str1="";
		for(int i=0;i<str.length();)
		{cnt=0;
			for(j=i;j<str.length();j++)
				{
				if(str.charAt(i)==str.charAt(j))
					cnt++;
				}
			if(cnt>1)
			{
				str1=str1+str.charAt(i)+cnt;
				i=i+cnt;
			}
			else
				{
				str1=str1+str.charAt(i);
				i++;
				}
	
		
				
					
		}
		System.out.println(str1);
	}
	

}

