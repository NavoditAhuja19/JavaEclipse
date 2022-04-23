package lect13;

import java.util.Scanner;

public class Nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		Nqueen(new boolean[n+1][n+1], 1, 1, n, 0, "");
		System.out.println("\n"+count);
	}
	static int count=0;

	public static void Nqueen(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {
		if (qpsf == tq) {
			count++;
			System.out.print(ans+" ");
			return;
		}
		if (col == board[0].length) {
			col = 1;
			row++;
		}
		if (row == board.length) {
			return;
		}

		// place
		if (isitsafetoplacequuec(board, row, col)) {
			board[row][col] = true;
			Nqueen(board, row, col + 1, tq, qpsf + 1, ans + "{" + row + "-" + col + "} ");
			board[row][col] = false;
		}
		// not place
		Nqueen(board, row, col + 1, tq, qpsf, ans);

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
