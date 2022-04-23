package lec1;

import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b=0,a;

		while (n > 0) {
			a= n % 10;
			b=b*10+a;
			n = n / 10;
		}

		
		System.out.println(b);
	}

}
