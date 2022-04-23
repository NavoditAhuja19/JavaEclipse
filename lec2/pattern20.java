package lec2;

public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= 2 * n - 1) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst)
					System.out.print("*");
				else
					System.out.print(" ");
				cst = cst + 1;
			}
			System.out.println();

			if (row <= n - 1) {
				nst = nst + 2;
				nsp = nsp - 1;
			} else {
				nst = nst - 2;
				nsp = nsp + 1;
			}
			row = row + 1;
		}

	}

}
