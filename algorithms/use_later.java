package algorithms;

import java.util.Scanner;

public class use_later {
	static Scanner scn = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		for(int i=0;i<t;i++)
		{
		int n1 = scn.nextInt();
	
		int n2 = scn.nextInt();
		int a[] = takeinput(n1);
		int b[] = takeinput(n2);
		max_path(a,b);
		}
	}
	public static int[] takeinput(int n) {
		
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}
	public static void max_path(int[] arr1,int[] arr2)
	{
		int sum1=0,sum2=0;
		int[] temp,temp1;
		for(int i=0;i<arr1.length||i<arr2.length;i++)
		{
			sum1=sum1+arr1[i];
			sum2=sum2+arr2[i];
			if(arr1[i]==arr2[i]&&sum1>sum2)
			{
				temp=arr1;
				arr1=arr2;
				arr2=temp;
				
			}
		
		}
		System.out.println(sum1);
		/*for(int i=0;i<arr1.length||i<arr2.length;i++)
		{
			
			if(arr1[i]==arr2[i])
			{
				temp1=arr2;
				arr2=arr1;
				arr1=temp1;
				
			}
			sum2=sum2+arr2[i];
		}*/
	
		if(sum1>sum2)
			System.out.println(sum1);
		else
			System.out.println(sum2);
		
	}

}
