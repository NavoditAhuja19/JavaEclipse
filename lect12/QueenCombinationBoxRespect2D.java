package lect12;

public class QueenCombinationBoxRespect2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queencombinationboxrespect2D(new boolean[2][3], 0, 0, 2, 0, "");
	}

	public static void queencombinationboxrespect2D(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
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
		board[row][col] = true;
		queencombinationboxrespect2D(board, row, col + 1, tq, qpsf + 1, ans + "[" + row + "-" + col + "]");
		board[row][col] = false;
		// not place
		queencombinationboxrespect2D(board, row, col + 1, tq, qpsf, ans);

	}

}
