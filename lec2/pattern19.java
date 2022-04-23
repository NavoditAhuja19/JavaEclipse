package lec2;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 9;
		int n = p / 2 + 1;
		int nst = n;
		int row = 1;
		int nsp = -1;
		while (row <= 2 * n - 1) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}
			cst = 1;
			if (row == 1 || row == 2 * n - 1) {
				while (cst < nst) {
					System.out.print("*");
					cst = cst + 1;
				}
			} else {
				while (cst <= nst) {
					System.out.print("*");
					cst = cst + 1;
				}
			}
			System.out.println();
			if (row <= n - 1) {
				nst = nst - 1;
				nsp = nsp + 2;
			} else {
				nst = nst + 1;
				nsp = nsp - 2;
			}
			row = row + 1;

		}
	}

}
