package lect14;

import java.util.Scanner;

public class N_MboardKqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// int m = scn.nextInt();

		Nqueen(new boolean[n][n], 0, 3, 0, "");
		// System.out.println("\n" + count);
	}

	static int count = 0;

	public static void Nqueen(boolean[][] board, int row, int tq, int qpsf, String ans) {

		if (tq==qpsf) {
			System.out.println(++count + ":" + ans);
			return;

		}
		if (row == board.length) {

			return;
		}

		for (int col = 0;  col < board[0].length; col++) {
			if (isitsafetoplacequuec(board, row, col)) {
				board[row][col] = true;
				Nqueen(board, row + 1, tq, qpsf + 1, ans + "{" + row + ":" + col + "} ");
				board[row][col] = false;
			}
		}
		Nqueen(board, row + 1, tq, qpsf, ans);

	}

	public static boolean isitsafetoplacequuec(boolean[][] board, int row, int col) {
		// vertically up
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
		}
		// horizontally left
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			c--;
		}
		// diagonally left
		r = row - 1;
		c = col - 1;
		while (c >= 0 && r >= 0) {
			if (board[r][c] == true) {
				return false;
			}

			c--;
			r--;
		}
		// diagonally right
		r = row - 1;
		c = col + 1;
		while (c < board[0].length && r >= 0) {
			if (board[r][c] == true) {
				return false;
			}

			c++;
			r--;
		}

		return true;
	}

}
