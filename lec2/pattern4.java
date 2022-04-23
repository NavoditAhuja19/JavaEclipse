package lec2;

public class pattern4 {
	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		int nsp = n;
		int row = 1;
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
			nsp = nsp - 1;
			nst = nst + 1;
		}
	}

}
