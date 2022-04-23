package leetcode;

public class wordsearch {
	public static void main(String[] args) {
		char[][] board = { { 'a', 'b', 'c', 'e' }, { 's', 'f', 'c', 's' }, { 'a', 'd', 'a', 'e' } };
		System.out.println(exist(board, "asa"));
	}

	public static boolean exist(char[][] board, String word) {
		char start=word.charAt(0);

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != start) {
					continue;
				}
				boolean recresult = WordSearch(board, i, j, new boolean[board.length][board[0].length], word, 0);

				if (recresult) {
					return true;
				}

			}
		}
		return false;

	}

	public static boolean WordSearch(char[][] board, int row, int col, boolean[][] visited, String word, int idx) {
		if (row < 0 || row == board.length || col < 0 || col == board[0].length || visited[row][col] == true)
			return false;

		if (word.charAt(idx) != board[row][col]) {
			return false;
		}
		if (idx == word.length() - 1) {
			// System.out.println("word found");

			return true;
		}
		boolean result = false;
		visited[row][col] = true;
		boolean top = WordSearch(board, row - 1, col, visited, word, idx + 1);// top
		if(top) {
			return true;
		}
		boolean left = WordSearch(board, row, col - 1, visited, word, idx + 1);// left
		if(left) {
			return true;
		}
		
		boolean down = WordSearch(board, row + 1, col, visited, word, idx + 1);// down
		if(down) {
			return true;
		}
		boolean right = WordSearch(board, row, col + 1, visited, word, idx + 1);// right
		if(right) {
			return true;
		}
		visited[row][col] = false;

		result = top || down || left || right;
		return result;
	}

}
