package lec6;

public class exit_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 0, 1, 0, 1 }, { 1, 1, 1, 1 } };
		exit(a);

	}

	public static void exit(int[][] arr) {
		int rmax = arr.length;
		int cmax = arr[0].length;
		int rmin = 0;
		int cmin = 0;
		int r = 0, c = 0;
		while ((r < arr.length && c < arr[0].length) && (r >= 0 && c >= 0)) {
			for (c = cmin; c < arr[0].length && ((r < arr.length && c < arr[0].length) && (r >= 0 && c >= 0)); c++) {
				if (arr[rmin][c] == 1) {
					rmin++;
					cmin = c;
					break;
				}

			}
			if (((r >= arr.length || c >= arr[0].length) || (r < 0 || c < 0))) {
				if (c >= arr[0].length)
					cmin = c - 1;
				if (r >= arr.length)
					rmin = r - 1;
				if (r < 0)
					rmin = r + 1;
				if (c < 0)
					cmin = c + 1;
				break;
			}
			for (r = rmin; r < arr.length && ((r < arr.length && c < arr[0].length) && (r >= 0 && c >= 0)); r++) {
				if (arr[r][cmin] == 1) {
					cmin--;
					rmin = r;
					break;
				}
			}
			if (((r >= arr.length || c >= arr[0].length) || (r < 0 || c < 0))) {
				if (c >= arr[0].length)
					cmin = c - 1;
				if (r >= arr.length)
					rmin = r - 1;
				if (r < 0)
					rmin = r + 1;
				if (c < 0)
					cmin = c + 1;
				break;
			}
			for (c = cmin; c >= 0 && ((r < arr.length && c < arr[0].length) && (r >= 0 && c >= 0)); c--) {
				if (arr[rmin][c] == 1) {
					rmin--;
					cmin = c;
					break;
				}

			}
			if (((r >= arr.length || c >= arr[0].length) || (r < 0 || c < 0))) {
				if (c >= arr[0].length)
					cmin = c - 1;
				if (r >= arr.length)
					rmin = r - 1;
				if (r < 0)
					rmin = r + 1;
				if (c < 0)
					cmin = c + 1;
				break;
			}
			for (r = rmin; r >= 0 && ((r < arr.length && c < arr[0].length) && (r >= 0 && c >= 0)); r--) {
				if (arr[r][cmin] == 1) {
					cmin++;
					rmin = r;
					break;
				}
			}
			if (((r >= arr.length || c >= arr[0].length) || (r < 0 || c < 0))) {
				if (c >= arr[0].length)
					cmin = c - 1;
				if (r >= arr.length)
					rmin = r - 1;
				if (r < 0)
					rmin = r + 1;
				if (c < 0)
					cmin = c + 1;
				break;
			}

		}

		System.out.println(rmin + " " + cmin);

	}

}
