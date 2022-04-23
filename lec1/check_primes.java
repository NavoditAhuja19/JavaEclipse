package lec1;

import java.util.Scanner;

public class check_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int j = 1;
		int cnt;

		int i ;
		for (i = 2; i <= n; i++) {
			 cnt = 0;
			 j=1;
			while (j <=i) {
				if (i % j == 0) {
					cnt=cnt+1;
				
				}
				j = j + 1;
			}

			if (cnt==2) {
				System.out.println(i);
			}

		}
	}
}
