package lec2;

public class pattern32b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = 1;
		int val = 1;

		while (row <= 2 * n - 1) {

			int csp = 1;
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0)
					System.out.print("*");
				else
					System.out.print(val);
				cst = cst + 1;
			}
			System.out.println();

			if (row <= n - 1) {
				nst = nst + 2;
				val = val + 1;

			} else {
				nst = nst - 2;
				val = val - 1;

			}
			row = row + 1;
		}

	}

}
