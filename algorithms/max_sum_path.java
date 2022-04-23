package algorithms;

import java.util.Scanner;

public class max_sum_path {
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
		int i=0;
		int j=0;
		int sum1=0,sum2=0,res=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				sum1+=arr1[i];
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				sum2+=arr2[j];
			
				j++;
			}
			else
			{
				res+=Math.max(sum1, sum2)+arr1[i];
				i++;j++;
				sum1=0;sum2=0;
				
			}
		}
		while(i<arr1.length) {
			sum1+=arr1[i];
			i++;
		}

		while(j<arr2.length) {
			sum2+=arr2[j];
			j++;
		}

		res+=Math.max(sum1, sum2);
		System.out.println(res);
	}
	

}
