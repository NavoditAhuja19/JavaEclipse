package lec2;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nst = n;
		int row = 1;
		int nsp = -1;
		while (row <= n) {
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
			if (row == 1) {
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
			nst = nst - 1;
			nsp = nsp + 2;
			row = row + 1;

		}
	}

}
