package leetcode;

public class dungeongame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] dungeon = { { 0 } };
		System.out.println(calculateMinimumHP(dungeon));

	}

	public static int calculateMinimumHP(int[][] dungeon) {
		int sum = 0;
		int sumpos = 0;
		for (int i = 0; i < dungeon.length; i++) {
			for (int j = 0; j < dungeon[0].length; j++) {
				if (dungeon[i][j] < 0) {
					sum += dungeon[i][j];
				} else {
					sumpos += dungeon[i][j];
				}
			}
		}
		sum = sum * (-1);
		int pos = -1;
		sum = sum + 1;
		int start = 1;
		int end = sum;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (CMHPTD(dungeon, mid, 0, 0, new boolean[dungeon.length][dungeon[0].length][sumpos+2+mid],new int[dungeon.length][dungeon[0].length][sumpos+2+mid])) {
				pos = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
//		for (int i = 1; i <= sum+1; i++) {
//
//			pos = i;
//			if (CMHPTD(dungeon, i, 0, 0,new boolean[dungeon.length][dungeon[0].length][sumpos+2])) {
//				break;
//			}
//
//		}

		return pos;
	}

	private static boolean CMHPTD(int[][] dungeon, int health, int row, int col, boolean[][][] strg,int[][][] visited) {
		// TODO Auto-generated method stub
		if (row >= dungeon.length || col >= dungeon[0].length) {
			return false;
		}
		if (health + dungeon[row][col] <= 0) {
			return false;
		}
		if (row == dungeon.length - 1 && col == dungeon[0].length - 1) {
			return true;
		}
		if (strg[row][col][health + dungeon[row][col]]) {
			return true;
		}
		if (!strg[row][col][health + dungeon[row][col]]&&visited[row][col][health+dungeon[row][col]]==1) {
			return false;
		}
		visited[row][col][health+dungeon[row][col]]=1;
		if (CMHPTD(dungeon, health + dungeon[row][col], row + 1, col, strg,visited)) {
			strg[row][col][health + dungeon[row][col]] = true;
			return true;
		}
		if (CMHPTD(dungeon, health + dungeon[row][col], row, col + 1, strg,visited)) {
			strg[row][col][health + dungeon[row][col]] = true;
			return true;
		}
		strg[row][col][health + dungeon[row][col]] = false;
		return false;

	}

	private static boolean calculateMinimumHP(int[][] dungeon, int health, int row, int col) {
		// TODO Auto-generated method stub
		if (row >= dungeon.length || col >= dungeon[0].length) {
			return false;
		}
		if (health + dungeon[row][col] <= 0) {
			return false;
		}
		if (row == dungeon.length - 1 && col == dungeon[0].length - 1 && health + dungeon[row][col] > 0) {
			return true;
		}
		if (calculateMinimumHP(dungeon, health + dungeon[row][col], row + 1, col)) {
			return true;
		}
		if (calculateMinimumHP(dungeon, health + dungeon[row][col], row, col + 1)) {
			return true;
		}
		return false;

	}

}
