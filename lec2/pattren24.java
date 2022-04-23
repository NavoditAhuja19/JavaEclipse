package lec2;

public class pattren24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int val = 1;
		while (row <= n) {
			val = row;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;

			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;
		}

	}

}
