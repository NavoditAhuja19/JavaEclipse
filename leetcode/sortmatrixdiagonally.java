package leetcode;

public class sortmatrixdiagonally {
	public int[][] diagonalSort(int[][] mat) {

		int n = mat.length;
		int m=mat[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				for(int k=1;k<Integer.min(m, n);k++) {
					if((i+k)<n&&(j+k)<m&&mat[i][j]>mat[i+k][j+k]) {
						int temp=mat[i+k][j+k];
						mat[i+k][j+k]=mat[i][j];
						mat[i][j]=temp;
					}
					else {
						break;
					}
				}
			
			
			}

		}

		return mat;

	}

}
