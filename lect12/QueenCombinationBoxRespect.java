package lect12;

public class QueenCombinationBoxRespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queencombinationboxrespect(new boolean[4], 0, 2, 0, "");
	}

	public static void queencombinationboxrespect(boolean[] board, int col, int tq, int qpsf, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if (col == board.length) {
			return;
		}

		
		// place
		board[col] = true;
		queencombinationboxrespect(board, col + 1, tq, qpsf + 1, ans + "b" + col);
		board[col] = false;
		// not place
		queencombinationboxrespect(board, col + 1, tq, qpsf, ans);

	}

}



