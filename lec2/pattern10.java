package lec2;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = (2 * n) - 1;
		int nsp = 0;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;

			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
			nsp = nsp + 1;
			nst = nst - 2;

		}

	}
}
