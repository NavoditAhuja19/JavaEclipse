package lec2;

public class pattren33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int val = 1;
		int val1 = 0;
		while (row <= n) {
			val = n - row + 1;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp = csp + 1;

			}
			int cst = 1;
			while (cst <= nst) {
				if (row == 1 || cst == (nst / 2) + 1)
					System.out.print(val1 + "\t");
				else
					System.out.print(val + "\t");
				if (cst <= nst / 2)
					val = val + 1;
				else
					val = val - 1;

				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;
		}

	}

}
