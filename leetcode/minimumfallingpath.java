package leetcode;

public class minimumfallingpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = { { -73, 61, 43, -48, -36 }, { 3, 30, 27, 57, 10 }, { 96, -76, 84, 59, -15 },
				{ 5, -49, 76, 31, -7 }, { 97, 91, 61, -46, 67 } };
		System.out.println(minFallingPathSum(A));

	}

	public static int minFallingPathSum(int[][] arr) {
		int min = Integer.MAX_VALUE;
		int pos=-1;
		for (int i = 0; i < arr[0].length; i++) {
			
			if(arr[0][i]<min) {
				min=arr[0][i];
				pos=i;
			}	
		}
		return MFPSTD2(arr, 0, pos, new int[arr.length][arr.length]);
		
	}

	private static int MFPSTD2(int[][] A, int row, int col, int[][] strg) {
		if (col >= A[0].length || col < 0) {
			return Integer.MAX_VALUE;
		}
		if (row == A.length - 1) {
			return A[row][col];
		}
		if (strg[row][col] != 0) {
			return strg[row][col];
		}
		int min = Integer.MAX_VALUE;
		for (int i = -A.length; i <= A.length; i++) {
			if (i == 0) {
				continue;
			}
			int ans = MFPSTD2(A, row + 1, col + i, strg);
			if (ans < min) {
				min = ans;
			}
		}

		strg[row][col] = min + A[row][col];
		return min + A[row][col];

	}

	private static int MFPSTD(int[][] A, int row, int col, int[][] strg) {
		if (col >= A[0].length || col < 0) {
			return Integer.MAX_VALUE;
		}
		if (row == A.length - 1) {
			return A[row][col];
		}
		if (strg[row][col] != 0) {
			return strg[row][col];
		}
		int l = MFPSTD(A, row + 1, col - 1, strg);
		int c = MFPSTD(A, row + 1, col, strg);
		int r = MFPSTD(A, row + 1, col + 1, strg);
		strg[row][col] = Math.min(l, Math.min(c, r)) + A[row][col];
		return Math.min(l, Math.min(c, r)) + A[row][col];

	}

	private static int minFallingPathSum(int[][] A, int row, int col) {
		if (col >= A[0].length || col < 0) {
			return Integer.MAX_VALUE;
		}
		if (row == A.length - 1) {
			return A[row][col];
		}
		int l = minFallingPathSum(A, row + 1, col - 1);
		int c = minFallingPathSum(A, row + 1, col);
		int r = minFallingPathSum(A, row + 1, col + 1);
		return Math.min(l, Math.min(c, r)) + A[row][col];

	}

}
