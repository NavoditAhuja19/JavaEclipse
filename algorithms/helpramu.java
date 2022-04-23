package algorithms;

import java.util.Scanner;

public class helpramu {
	static Scanner scn=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=scn.nextInt();
		for(int i=0;i<t;i++)
		deposit();

	}
	public static void deposit() {
		int c1=scn.nextInt();
		int c2=scn.nextInt();
		int c3=scn.nextInt();
		int c4=scn.nextInt();
		int n=scn.nextInt();
		int m=scn.nextInt();

		int sumr=0,sumc=0,sum=0,ans1=0,ans2=0,ansf=0;
		
		int[] rick=new int[n];
		int[] cab=new int[m];
		for(int i=0;i<rick.length;i++)
		{
			rick[i]=scn.nextInt();
		}
		for(int i=0;i<cab.length;i++)
		{
			cab[i]=scn.nextInt();
		}
		for(int i=0;i<rick.length;i++)
		{
			sumr=sumr+Math.min(rick[i]*c1,c2);
		}
		ans1=Math.min(sumr, c3);
		
		for(int i=0;i<cab.length;i++)
		{
			sumc=sumc+Math.min(cab[i]*c1,c2);
		}
		ans2=Math.min(sumc, c3);
		ansf=Math.min(ans1+ans2, c4);
		System.out.println(ansf);
	}

}
