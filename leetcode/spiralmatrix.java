package leetcode;

import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {
		               {1, 2, 3, 4},
		               {5, 6, 7, 8},
		               {9,10,11,12}
		};
		System.out.println(spiralOrder(arr));
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		int minrow = 0;
		int mincol = 0;
		int maxrow = matrix.length - 1;
		int maxcol = matrix[0].length - 1;
		int total = matrix.length * matrix[0].length;
		int cnt = 0;

		while (cnt < total) {
			for (int c = mincol; c <= maxcol && cnt < total; c++) {
				cnt++;
				list.add(matrix[minrow][c]);

			}
			minrow++;
			for (int r = minrow; r <= maxrow && cnt < total; r++) {
				cnt++;
				list.add(matrix[r][maxcol]);

			}
			maxcol--;
			for (int c = maxcol; c >= mincol && cnt < total; c--) {
				cnt++;
				list.add(matrix[maxrow][c]);

			}
			maxrow--;

			for (int r = maxrow; r >= minrow && cnt < total; r--) {
				cnt++;
				list.add(matrix[r][mincol]);

			}
			mincol++;

		}
		return list;
	}

}
