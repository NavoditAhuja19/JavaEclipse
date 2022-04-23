package algorithms;

import java.util.Scanner;

public class painter {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int np = scn.nextInt();
		int nb = scn.nextInt();
		int[] a=takeinput(nb);
		
		sort(a);
		
		int sum[]=painter(a, nb, np);

		int max_sum=sum[0];
		for(int i=1;i<sum.length;i++)
		{
			if(max_sum<sum[i])
				max_sum=sum[i];
			
		}
		System.out.println(max_sum);
	}
		

	public static int[] takeinput(int n) {

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

	public static int[] painter(int[] arr, int nb, int np) {
		int sum=0,cnt=0;
		if(np>nb)
			np=nb;
		int[] abc = new int[np];
		for(int i=np-1;i>=0;i--)
		{
			sum=0;
			for(int j=(np-1)-i;j<arr.length;j=j+np)
			{
				sum=sum+arr[j];
				
			}
			abc[cnt]=sum;
			cnt++;
		}
		
	return abc;
	}
	public static void sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++)

		{
			for (int j = 0; j < (arr.length - 1)-i; j++) {
				if (arr[j + 1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
