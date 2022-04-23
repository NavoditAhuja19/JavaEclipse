package lec2;

public class pattern31 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int val = 5;
		while (row <= n) {
			val = 5;
			int col = 1;
			while (col <= n) {
				System.out.print(val);
				val--;
				col = col + 1;
			}
			System.out.println();
			row = row + 1;

		}
	}
}
