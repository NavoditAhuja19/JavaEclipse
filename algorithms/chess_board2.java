package algorithms;

import java.util.Scanner;

public class chess_board2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = (++cnt);

			}

		}

		chessgame(arr, 0, 0, n - 1, n - 1, "");
		System.out.println();
		System.out.println(count);

	}

	static int count = 0;

	public static void chessgame(int[][] board, int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans + "{" + er + "-" + ec + "}" + " ");
			count++;
			return;
		}
		if (cc > ec || cr > er || check_prime(board[cr][cc]) == 0) {
			return;
		}
		if (check_prime(board[cr][cc]) == 1) {
			chessgame(board, cr + (er - cr), cc + (ec - cc), er, ec, ans + "{" + cr + "-" + cc + "}" + "P");

		}
		chessgame(board, cr + 2, cc + 1, ec, er, ans + "{" + cr + "-" + cc + "}" + "K");
		chessgame(board, cr + 1, cc + 2, ec, er, ans + "{" + cr + "-" + cc + "}" + "K");
		if (cc == 0 || cr == 0 || cr == er || cc == ec) {

			for (int i = 1; i + cc <= ec; i++) {
				chessgame(board, cr, cc + i, ec, er, ans + "{" + cr + "-" + cc + "}" + "R");
			}
			for (int i = 1; i + cr <= er; i++) {
				chessgame(board, cr + i, cc, ec, er, ans + "{" + cr + "-" + cc + "}" + "R");
			}
		}
		if (cc == cr || cc + cr == er) {
			for (int i = 1; i + cc <= ec && i + cr <= er; i++) {
				chessgame(board, cc + i, cr + i, ec, er, ans + "{" + cr + "-" + cc + "}" + "B");
			}
		}
		return;
	}

	public static int check_prime(int n) {
		if (n == 1)
			return -1;
		else {
			if (prime(n)) {
				int j = 1;
				int cnt;
				int cnt1 = 0;

				for (int i = 2; i <= n; i++) {
					cnt = 0;
					j = 1;
					while (j <= i) {
						if (i % j == 0) {
							cnt = cnt + 1;

						}
						j = j + 1;
					}

					if (cnt == 2) {
						cnt1++;
					}

				}
				if (cnt1 % 2 == 0) {
					return 1;

				} else
					return 0;
			} else
				return -1;
		}
	}

	public static boolean prime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {

				return false;

			}

		}

		return true;

	}

}

//{0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-2}P{2-2} {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}P{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2} {0-0}R{2-0}P{2-2} {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{2-2}
