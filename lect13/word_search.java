package lect13;

public class word_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "ese";

		char[][] board = { { 'a', 'b', 'c', 'e' }, { 's', 'f', 'c', 's' }, { 'a', 'd', 'a', 'e' } };
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				wordsearch(board, i, j, new boolean[board.length][board[0].length], word, 0);

			}
		}

	}

	public static void wordsearch(char[][] board, int row, int col, boolean[][] visited, String word, int idx) {
		if (row < 0 || row == board.length || col < 0 || col == board[0].length || visited[row][col] == true)
			return;

		if (word.charAt(idx) != board[row][col]) {
			return;
		}
		if (idx == word.length() - 1) {
			System.out.println("word found");

			return;
		}
		visited[row][col] = true;
		wordsearch(board, row - 1, col, visited, word, idx + 1);// top
		wordsearch(board, row, col - 1, visited, word, idx + 1);// left
		wordsearch(board, row + 1, col, visited, word, idx + 1);// down
		wordsearch(board, row, col + 1, visited, word, idx + 1);// right
		visited[row][col] = false;

	}

}
