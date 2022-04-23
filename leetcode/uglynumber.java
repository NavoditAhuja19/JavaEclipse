package leetcode;

public class uglynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(-2147483648));

	}

	public static boolean isUgly(int num) {
		int flag = 0;
		
		while (num > 1) {
			if (num % 2 == 0) {
				num = num / 2;
			}
			else if (num % 3 == 0) {
				num = num / 3;
			}
			else if (num % 5 == 0) {
				num = num / 5;
			} else {
				flag = 1;
				break;
			}
		}
		if (flag == 1||num<=0) {
			return false;
		}
		return true;
	}

}
