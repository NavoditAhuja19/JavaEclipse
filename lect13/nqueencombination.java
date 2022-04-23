 package lect13;

import lec7.string_comparison;

public class nqueencombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nquuencombination(new boolean[4], 2, 0, "",0);

	}

	static int count = 0;

	public static void nquuencombination(boolean board[], int tq, int qpsf, String ans,int lastboxused) {
		if (tq == qpsf) {
			System.out.println(++count + ":" + ans);
			return;
		}

		for (int i = lastboxused; i < board.length; i++) {

			if (board[i] == false) {
				board[i] = true;

				nquuencombination(board, tq, qpsf + 1, ans + "B" + i+ "Q" + qpsf+" ",i+1);
				board[i] = false;
			}
		}

	}

}
