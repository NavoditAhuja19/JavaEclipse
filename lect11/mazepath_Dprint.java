package lect11;

import java.util.Scanner;

public class mazepath_Dprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int r=scn.nextInt();
		int c=scn.nextInt();
		
		int count=mazepath(0, 0, r, c, "");
		System.out.println();
		System.out.println(count);

	}

	public static int mazepath(int cc, int cr, int ec, int er, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans+" ");
			return 1;
		}
		if (cc > ec || cr > er) {
			return 0;
		}
		int count = 0;
		count += mazepath(cc + 1, cr, ec, er, ans + "V");
		count += mazepath(cc, cr + 1, ec, er, ans + "H");
		count += mazepath(cc + 1, cr + 1, ec, er, ans + "D");

		return count;
	}

}
