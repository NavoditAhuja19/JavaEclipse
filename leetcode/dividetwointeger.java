package leetcode;

public class dividetwointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.abs(-5));
		System.out.println(divide(Integer.MIN_VALUE, -1));
	}

	public static int divide(int dividend, int divisor) {
		int sign = 0;
		if (divisor > 0 && dividend > 0) {
			sign = 1;
		} else if (divisor < 0 && dividend < 0) {
			sign = 1;
		} else if (divisor > 0 && dividend < 0) {
			sign = -1;
		} else if (divisor < 0 && dividend > 0) {
			sign = -1;
		}
		int cnt=0;
		if(dividend==Integer.MIN_VALUE) {
			dividend=Integer.MAX_VALUE;
		}
		divisor = Math.abs(divisor);
		dividend = Math.abs(dividend);
		while (dividend > 0) {
			dividend = dividend - divisor;
			cnt++;
		}
		if(dividend==0) {
			return 0;
		}
		if (sign == 1) {
			return cnt;

		} else {
			return -cnt;
		}

	}

}
