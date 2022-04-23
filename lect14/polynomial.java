package lect14;

public class polynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polynomial1(5, 3);

	}

	public static void polynomial1(int n, int x) {

		int a = 0;
		int mul = 1;
		for (int i = n; i >= 1; i--) {

			a = a + (i * x * mul);
			mul *= x;
		}
		System.out.println(a);

	}

	public static void polynomial2(int n, int x) {

		int a = 0;
		int mul = 3;
		for (int coeff = n; coeff >= 1; coeff--) {

			a = a + (coeff * mul);
			mul *= x;
		}
		System.out.println(a);

	}

}
