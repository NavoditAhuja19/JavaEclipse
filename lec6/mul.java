package lec6;

public class mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int b[][] = { { 1, 2, 3, 4 }, { 4, 5, 6, 9 }, { 7, 8, 9, 10 } };

		mul(a, b);
	}

	public static void mul(int[][] a, int[][] b) {
		int[][] d = new int[a.length][b[0].length];
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < b[0].length; c++) {
				int sum = 0;
				for (int k = 0; k < b.length; k++) {
					int val = a[r][k] + b[k][c];
					sum += val;
				}
				d[r][c] = sum;
			}

		}
		display(d);

	}

	public static void display(int[][] arr)

	{
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();

		}
	}

}
