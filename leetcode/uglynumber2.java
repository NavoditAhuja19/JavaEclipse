package leetcode;

public class uglynumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthUglyNumber(1352));

	}

	public static int nthUglyNumber(int n) {
		int cnt = 0;
		int num = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if(i%2==0||i%3==0||i%5==0) {
			if (isUgly(i)) {
				cnt++;
				if (cnt == n) {
					num = i;
					break;
				}
			}
			}
		}
		return num;

	}

	public static boolean isUgly(int num) {
		int flag = 0;

		while (num > 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else if (num % 3 == 0) {
				num = num / 3;
			} else if (num % 5 == 0) {
				num = num / 5;
			} else {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			return false;
		}
		return true;
	}

}
