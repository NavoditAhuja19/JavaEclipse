package algorithms;

import java.util.Scanner;

public class sum_pair {
	static 	Scanner scn=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[] = takeinput();
		sum_pair(a);

	}
	public static void sum_pair(int[] arr)
	{
		int tar=scn.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==tar)
				{
					if(arr[i]<arr[j])
					{
						System.out.println(arr[i]+" and "+arr[j]);
					}
				}
			}
		}
		
	}
	public static int[] takeinput() {
		
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

}
