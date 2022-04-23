package lec2;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = 1;

		while (row <= 2 * n - 1) {
			int csp = 1;
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}
			System.out.println();

			if (row <= n - 1) {
				nst = nst + 1;

			} else {
				nst = nst - 1;

			}
			row = row + 1;
		}

	}

}
