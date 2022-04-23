package algorithms;

import java.util.Scanner;

public class chess_board {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		

		chessgame(0, 0, n-1, n-1, "");
		System.out.println();
		System.out.println(count);

	}

	public static void chessgame(int cc, int cr, int ec, int er, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans + "{" + er + ":" + ec + "}" + " ");
			count++;
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}

		chessgame(cc + 1, cr + 2, ec, er, ans + "{" + cr + ":" + cc + "}" + "K");
		chessgame(cc + 2, cr + 1, ec, er, ans + "{" + cr + ":" + cc + "}" + "K");
		if (cc == 0 || cr == 0 || cr == er || cc == ec) {

			for (int i = 1; i <= ec; i++) {
				chessgame(cc + i, cr, ec, er, ans + "{" + cr + ":" + cc + "}" + "R");
				 }
				 for (int i = 1; i <= er; i++) {
				chessgame(cc, cr + i, ec, er, ans + "{" + cr + ":" + cc + "}" + "R");
			}
		}
		if (cc == cr||cc+cr==er) {
			for (int i = 1; i <= ec; i++) {
				chessgame(cc + i, cr + i, ec, er, ans + "{" + cr + ":" + cc + "}" + "B");
			}
		}
		return;
	}

}
//{0:0}K{2:1}R{2:2} {0:0}K{1:2}R{2:2} {0:0}R{0:1}K{2:2} {0:0}R{0:1}R{0:2}R{1:2}R{2:2} {0:0}R{0:1}R{0:2}R{2:2} {0:0}R{0:1}R{1:1}B{2:2} {0:0}R{0:1}R{2:1}R{2:2} {0:0}R{0:2}R{1:2}R{2:2} {0:0}R{0:2}R{2:2} {0:0}R{1:0}K{2:2} {0:0}R{1:0}R{1:1}B{2:2} {0:0}R{1:0}R{1:2}R{2:2} {0:0}R{1:0}R{2:0}R{2:1}R{2:2} {0:0}R{1:0}R{2:0}R{2:2} {0:0}R{2:0}R{2:1}R{2:2} {0:0}R{2:0}R{2:2} {0:0}B{1:1}B{2:2} {0:0}B{2:2} 
//{0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-1}K{2-2} {0-0}R{0-1}R{0-2}R{1-2}R{2-2} {0-0}R{0-1}R{0-2}R{2-2} {0-0}R{0-1}R{1-1}B{2-2} {0-0}R{0-1}R{2-1}R{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-1}B{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{1-1}B{2-2} {0-0}B{2-2}
