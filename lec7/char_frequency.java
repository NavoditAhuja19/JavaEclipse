package lec7;

import java.util.Scanner;

public class char_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		frequency(str);

		
	}
	public static void frequency(String str)
	{
		int cnt=0,val=0;
		int pos=-1;
		for(int i=0;i<str.length();i++)
		{
			
			cnt=0;
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(j)==str.charAt(i))
					cnt++;
			}
			if(val<cnt)
				{
				val=cnt;
				pos=i;
				
				}
		}
		System.out.println(str.charAt(pos));
	}
	

}

