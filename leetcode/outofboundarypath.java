package leetcode;

public class outofboundarypath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int) (Math.pow(10, 9) + 7);
		// System.out.println(919247897%a);
		System.out.println(findPaths(8, 50, 23, 5, 26));
	}

	public static int findPaths(int m, int n, int N, int i, int j) {

		int a = (int) (Math.pow(10, 9) + 7);
		int[][][] arr = new int[m][n][N + 1];
		for (int z = 0; z < m; z++) {
			for (int y = 0; y < n; y++) {
				for (int x = 0; x <= N; x++) {
					arr[z][y][x] = -1;
				}
			}
		}

		return FPTD(m, n, N, i, j, arr, a);

	}

	public static int FPTD(int m, int n, int N, int i, int j, int[][][] strg, int a) {
		if (N < 0) {
			return 0;
		}
		if (i >= m || i < 0 || j < 0 || j >= n) {
			return 1;
		}
		if (strg[i][j][N] != -1) {
			return strg[i][j][N] % a;
		}
		int totalPaths = 0;
		totalPaths = (totalPaths + FPTD(m, n, N - 1, i - 1, j, strg, a) % a) % a;
		totalPaths = (totalPaths + FPTD(m, n, N - 1, i + 1, j, strg, a) % a) % a;
		totalPaths = (totalPaths + FPTD(m, n, N - 1, i, j - 1, strg, a) % a) % a;
		totalPaths = (totalPaths + FPTD(m, n, N - 1, i, j + 1, strg, a) % a) % a;


		strg[i][j][N] = totalPaths % a;
		return totalPaths % a;

	}

	public static int findPath(int m, int n, int N, int i, int j) {
		if (N <= 0) {
			return 0;
		}
		if (i >= m || i < 0 || j < 0 || j >= n) {
			return 1;
		}
		int b = findPath(m, n, N - 1, i + 1, j);
		int t = findPath(m, n, N - 1, i - 1, j);
		int r = findPath(m, n, N - 1, i, j + 1);
		int l = findPath(m, n, N - 1, i, j - 1);
		return l + r + b + t;

	}

}
