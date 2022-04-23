package algorithms;

import java.util.Scanner;

public class input_num {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int cnt = 1;
		int[] abc = new int[1000];
		int i = 0;
		int n=0;
		while (sum>=0)
		{

			
			 n = scn.nextInt();
			 

			abc[i] = n;
			sum=sum+n;
			cnt++;

		
			i++;
			
		}
		
	
		for (int j = 0; j < i-1; j++) {
			System.out.println(abc[j]);
		}

	}

	public static int sum(int n) {
		
		int sum =0;
	
			sum = sum+n;

	
	
		return sum;
	}
}
