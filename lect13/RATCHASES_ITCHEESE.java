package lect13;

import java.util.Scanner;

public class RATCHASES_ITCHEESE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
	

//		char[][] board = { { 'o', 'X', 'o', 'o' }, { 'o', 'o', 'o', 'o' }, { 'X', 'X', 'X', 'o' },
//				{ 'X', 'X', 'X', 'o' },{ 'x', 'x', 'X', 'o' } };
		char[][] board = new char[n][m];
		for (int l = 0; l < n; l++) {
			String str1 = scn.next();
			for (int s = 0; s < str1.length(); s++) {
				board[l][s] = str1.charAt(s);
			}
		}

		String str = cheesepath(board, 0, 0, "", new boolean[board.length][board[0].length]);
		if (str.length() != 0) {
			System.out.print(str+" ");
			System.out.println();
			int[][] abc = new int[n][m];
			abc[0][0] = 1;
			int i = 0;
			int j = 0;
			for (int k = 0; k < str.length(); k++) {
				if (str.charAt(k) == 'D' && i < n - 1) {
					abc[++i][j] = 1;
				}
				if (str.charAt(k) == 'T' && i > 0) {
					abc[--i][j] = 1;
				}
				if (str.charAt(k) == 'R' && j < m - 1) {
					abc[i][++j] = 1;
				}
				if (str.charAt(k) == 'L' && j > 0) {
					abc[i][--j] = 1;
				}
			}

			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					System.out.print(abc[i][j] + " ");

				}
				System.out.println();
			}
		} else {
			System.out.println("NO PATH FOUND");
		}
	}

	public static String cheesepath(char[][] board, int row, int col, String ans, boolean[][] visited) {
		if (row < 0 || row == board.length || col < 0 || col == board[0].length || visited[row][col] == true
				|| board[row][col] == 'X')
			return "";
		if (row == (board.length - 1) && col == board[0].length - 1) {

			return ans;
		}

		visited[row][col] = true;
		String a = "";

		a = a + cheesepath(board, row - 1, col, ans + "T", visited);
		a = a + cheesepath(board, row, col - 1, ans + "L", visited);
		a = a + cheesepath(board, row + 1, col, ans + "D", visited);
		a = a + cheesepath(board, row, col + 1, ans + "R", visited);

		visited[row][col] = false;

		return a;
	}

}
