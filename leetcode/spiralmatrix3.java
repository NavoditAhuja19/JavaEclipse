package leetcode;

public class spiralmatrix3 {
	 public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
		 int[][] matrix=new int[R][C];
			
			int minrow = 0;
			int mincol = 0;
			int maxrow = matrix.length - 1;
			int maxcol = matrix[0].length - 1;
			int total = matrix.length * matrix[0].length;
			int cnt = 0;
			while (cnt < total) {
				for (int c = mincol; c <= maxcol && cnt < total; c++) {
					cnt++;
					matrix[minrow][c]=cnt-1;

				}
				minrow++;
				for (int r = minrow; r <= maxrow && cnt < total; r++) {
					cnt++;
					matrix[r][maxcol]=cnt-1;

				}
				maxcol--;
				for (int c = maxcol; c >= mincol && cnt < total; c--) {
					cnt++;
					matrix[maxrow][c]=cnt-1;

				}
				maxrow--;

				for (int r = maxrow; r >= minrow && cnt < total; r--) {
					cnt++;
					matrix[r][mincol]=cnt-1;

				}
				mincol++;

			}
			return matrix;
		}
	        
	    }
}
