package lect13;

public class Nknightsmaxplaced {
static int a=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nknights(new boolean[4][4], 0, 0, 4, 0, "");
		System.out.println(a);
	}

	public static void Nknights(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {
//		if (qpsf == tq) {
//			System.out.println(ans);
//			return;
//		}
		if (col == board[0].length) {
			col = 0;
			row++;
		}
		if (row == board.length) {
			
			if(qpsf>a)
			{
				a=qpsf;
			}
			return;
		}

		// place
		if (isitsafetoplaceknight(board, row, col)) {
			board[row][col] = true;
			Nknights(board, row, col + 1, tq, qpsf + 1, ans + "[" + row + "-" + col + "]");
			board[row][col] = false;
		}
		// not place
		Nknights(board, row, col + 1, tq, qpsf, ans);

	}

	public static boolean isitsafetoplaceknight(boolean[][] board, int row, int col) {
		// case 1
		
		int r = row - 1;
		int c = col-2;
		
			if (r>=0&&c>=0&&board[r][c] == true) {
				return false;
		
		}
			// case 2
			 r = row - 2;
			 c = col-1;
			
				if (r>=0&&c>=0&&board[r][c] == true) {
					return false;
			
			}
				// case 3
				
			r = row -2;
			 c = col+1;
				
					if (r>=0&&c<board[0].length&&board[r][c] == true) {
						return false;
				
				}
					// case 4
				 r = row - 1;
					 c = col+2;
					
						if (r>=0&&c<board[0].length&&board[r][c] == true) {
							return false;
					
					}
			
		
		return true;
	}

}
