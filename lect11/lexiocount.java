package lect11;

import java.util.Scanner;

public class lexiocount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
	
		System.out.println(lexiocounting(0, n));

	}

	public static int lexiocounting(int curr, int end) {
		if (curr > end) {
			return 0;
		}
		System.out.println(curr+" ");
		int i = 0;
		if (curr == 0)
			i = 1;

		int count = 0;
		while (i <= 9) {
			count += lexiocounting(curr * 10 + i, end);
			i++;
		}
		return count + 1;
	}

}
