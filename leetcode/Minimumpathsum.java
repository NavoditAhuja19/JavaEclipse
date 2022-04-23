package leetcode;

public class Minimumpathsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int minPathSum(int[][] grid) {
	        
		return MPSTD(grid, 0, 0, new int[grid.length][grid[0].length]);
		 
		 
	    }
	 private static int MPSTD(int[][] grid, int row, int col,int[][] strg) {
			if(row==grid.length-1&&col==grid[0].length-1) {
				return grid[row][col];
			}
			if(row>=grid.length||col>=grid[0].length) {
				return Integer.MAX_VALUE;
			}
			if(strg[row][col]!=0) {
				return strg[row][col];
			}
				int b=MPSTD(grid, row+1, col,strg);
				int r=MPSTD(grid, row, col+1,strg);
				strg[row][col]=Math.min(b, r)+grid[row][col];
				return Math.min(b, r)+grid[row][col];
			}
	private static int minPathSum(int[][] grid, int row, int col) {
	if(row==grid.length-1&&col==grid[0].length-1) {
		return grid[row][col];
	}
	if(row>=grid.length||col>=grid[0].length) {
		return Integer.MAX_VALUE;
	}
		int b=minPathSum(grid, row+1, col);
		int r=minPathSum(grid, row, col+1);
		return Math.min(b, r)+grid[row][col];
	}

}
