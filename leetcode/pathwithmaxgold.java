package leetcode;

public class pathwithmaxgold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int getMaximumGold(int[][] grid) {
		int max = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				int res = getMaximumGold(grid, i, j, new boolean[grid.length][grid[0].length]);
				if (res > max) {
					max = res;
				}
			}
		}
		return max;
	}

	private static int getMaximumGold(int[][] grid, int row, int col, boolean[][] visited) {
		// TODO Auto-generated method stub
		if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0
				|| visited[row][col]) {
			return 0;
		}
		visited[row][col] = true;
		int down = getMaximumGold(grid, row + 1, col, visited);
		int up = getMaximumGold(grid, row - 1, col, visited);
		int left = getMaximumGold(grid, row, col + 1, visited);
		int right = getMaximumGold(grid, row, col - 1, visited);
		visited[row][col] = false;
		return Math.max(up, Math.max(down, Math.max(left, right))) + grid[row][col];
	}
}
