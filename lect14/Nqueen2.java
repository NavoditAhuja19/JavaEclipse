package lect14;

import java.util.Scanner;

public class Nqueen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		nqueen(new boolean[n ][n ], 0, "");
	
	}

	static int count = 0;

	public static void nqueen(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(++count + ":" + ans);
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafetoplacequuec(board, row, col)) {
				board[row][col] = true;
				nqueen(board, row + 1, ans + "{" + row + ":" + col + "} ");
				board[row][col] = false;
			}
		}

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
