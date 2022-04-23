package leetcode;

import java.util.ArrayList;
import java.util.List;

public class wordsearch2 {
	public static void main(String[] args) {

	}

	public List<String> findWords(char[][] board, String[] words) {

		List<String> main=new ArrayList<>();
		int flag=0;
		for (String word : words) {
			char start=word.charAt(0);
			flag=0;
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {

					if(board[i][j]!=start) {
						continue;
					}
					boolean recresult = WordSearch(board, i, j, new boolean[board.length][board[0].length], word, 0);

					if(recresult) {
						main.add(word);
						flag=1;
						break;
					}
				}
				if(flag==1) {
					break;
				}
			}
		}
		return main;
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
