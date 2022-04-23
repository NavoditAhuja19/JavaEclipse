package algorithms;

import java.util.Scanner;

public class sum_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int[] arr = new int[a];
		int i = 0;

		while (a > 0) {

		
			int n = scn.nextInt();
			arr[i] = check_even_odd(n);
			i++;
			a--;
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}

	public static int check_even_odd(int n) {
		
		int sum_odd = 0;
		int sum_even = 0;

		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 != 0) {
				sum_odd += rem;
			} else {
				sum_even += rem;
			}
			n = n / 10;
			

		}
		if(sum_even%4==0||sum_odd%3==0)
			return 1;
		

		return 0;
	}

}
