package lec3;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int min = scn.nextInt();
		int max = scn.nextInt();
		int step = scn.nextInt();
		int temp;
		for(temp=min;temp<=max;temp=temp+step)
		{
			int c=5*(temp-32)/9;
			System.out.println(temp+" "+c);
		}

	}

}
