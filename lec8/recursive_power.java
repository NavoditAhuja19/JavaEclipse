package lec8;

public class recursive_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p = power(2, 5);
		System.out.println(p);
	}

	public static int power(int x, int n) {

		if (n == 0)
			return 1;
		int pow = power(x, n - 1);
		int finalp = pow * x;

		return finalp;
	}

}
