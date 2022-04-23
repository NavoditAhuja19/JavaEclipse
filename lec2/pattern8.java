package lec2;

public class pattern8 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= n) {
				if (row == col || col + row == n + 1)
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
