package algorithms;

import java.util.Scanner;

public class circular_sum2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		int[] abc = new int[t];
		for (int i = 0; i < t; i++) {
			int a[] = takeinput();

			abc[i] = c_sum(a);
			
				
			}
		

		
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}

	}

	public static int c_sum(int[] arr) {

		int sum = 0;
		int pos = 0;
		int[] sum1 = new int[arr.length];
		int[] sum2 = new int[arr.length];
		for (int j = 0; j < sum1.length; j++) {
			sum=0;
			for (int i = 0; i < arr.length - 1; i++) {
				sum = sum + arr[i];
				sum2[i]=sum;
			}
			int max1=sum2[0];
			for(int i=0;i<sum2.length;i++)
			{
				if(max1<sum2[i])
					max1=sum2[i];
			}
			
			sum1[j]=max1;
			rotate(arr,1);

		}
		int max=sum1[0];
		for(int j=1;j<sum1.length;j++)
		{
			if(max<sum1[j])
				max=sum1[j];
		}
		return max;
	}

	public static int[] takeinput() {

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

	public static void rotate(int[] arr, int cnt) {
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j <= arr.length - 2; j++) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}

	}

}
