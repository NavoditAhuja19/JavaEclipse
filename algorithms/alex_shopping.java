package algorithms;

import java.util.Scanner;

public class alex_shopping {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int a[] = takeinput();
		int a[] = { 100, 200, 400, 100 };
		int q=scn.nextInt();
		shopping(a,q);

	}
	public static int[] takeinput() {
	
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}
	public static void shopping(int[] arr,int q)
	{
		
	
		int[] abc=new int[q];
		for(int j=0;j<q;j++)
		{
			int cnt=0;
			int a=scn.nextInt();
			int k=scn.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			
				if(a%arr[i]==0)
				
					cnt++;
				
				
		
		}
		if(cnt>=k)
		abc[j]=1;	
		else 
			abc[j]=0;
		
		
		}
		for(int i=0;i<abc.length;i++)
		{
			if(abc[i]==1)
				System.out.println("Yes");
			else
				System.out.println("no");
		}
	}

}
