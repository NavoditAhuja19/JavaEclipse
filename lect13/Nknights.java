package lect13;

import java.util.Scanner;

public class Nknights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Nknights(new boolean[n][n], 0, 0, n, 0, "");
		System.out.println("\n" + count);
	}

	static int count = 0;

	public static void Nknights(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {
		if (qpsf == tq) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (col == board[0].length) {
			col = 0;
			row++;
		}
		if (row == board.length) {
			return;
		}

		// place
		if (isitsafetoplaceknight2(board, row, col)) {
			board[row][col] = true;
			Nknights(board, row, col + 1, tq, qpsf + 1, ans + "{" + row + "-" + col + "} ");
			board[row][col] = false;
		}
		// not place
		Nknights(board, row, col + 1, tq, qpsf, ans);

	}

	public static boolean isitsafetoplaceknight(boolean[][] board, int row, int col) {
		// case 1

		int r = row - 1;
		int c = col - 2;

		if (r >= 0 && c >= 0 && board[r][c] == true) {
			return false;

		}
		// case 2
		r = row - 2;
		c = col - 1;

		if (r >= 0 && c >= 0 && board[r][c] == true) {
			return false;

		}
		// case 3

		r = row - 2;
		c = col + 1;

		if (r >= 0 && c < board[0].length && board[r][c] == true) {
			return false;

		}
		// case 4
		r = row - 1;
		c = col + 2;

		if (r >= 0 && c < board[0].length && board[r][c] == true) {
			return false;

		}

		return true;
	}

	public static boolean isitsafetoplaceknight2(boolean[][] board, int row, int col) {

		int arrrow[] = { -1, -2, -2, -1 };
		int arrcol[] = { -2, -1, +1, +2 };
		for (int i = 0; i < arrrow.length; i++) {
			int nr = row + arrrow[i];
			int nc = col + arrcol[i];
			if (nr >= 0 && nr < board.length && nc >= 0 && nc < board[0].length && board[nr][nc]) {
				return false;
			}
		}

		return true;
	}

}
