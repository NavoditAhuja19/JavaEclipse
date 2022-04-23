package lec2;

public class pattern7 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= n) {
				if (row == 1 || row == n || col == 1 || col == n)
					System.out.print("*");
				else
					System.out.print(" ");
				col = col + 1;
			}
			System.out.println();
			row = row + 1;

		}
	}
}
