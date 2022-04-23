package lect13;

import lec7.string_comparison;

public class nqueenpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nquuenpermutation(new boolean[4], 2, 0, "");

	}

	static int count = 0;

	public static void nquuenpermutation(boolean board[], int tq, int qpsf, String ans) {
		if (tq == qpsf) {
			System.out.println(++count + ":" + ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {

			if (board[i] == false) {
				board[i] = true;

				nquuenpermutation(board, tq, qpsf + 1, ans + "B" + i+ "Q" + qpsf+" ");
				board[i] = false;
			}
		}

	}

}
