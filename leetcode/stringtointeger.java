package leetcode;

public class stringtointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(myAtoi("31.14159"));
	}

	public static int myAtoi(String str) {
		int idx = 0;
		int cnt = 0;
		int si = -1;
		int ei = -1;
		int sign = 1;
		while (idx < str.length()) {

			if (str.charAt(idx) == ' ' && cnt == 0) {
				idx++;
				continue;
			}
			if ((str.charAt(idx) == '+' || str.charAt(idx) == '-') && cnt == 0) {

				if (str.charAt(idx) == '+') {
					sign = 1;
				} else {
					sign = -1;
				}
				idx++;

			}
			if (!Character.isDigit(str.charAt(idx))) {
				break;
			}
			if (Character.isDigit(str.charAt(idx)) && cnt == 0) {

				si = idx;
				ei = idx;
				idx++;
			
				while (idx < str.length()) {
					if (!Character.isDigit(str.charAt(idx))) {

						idx--;
						break;
					}

					ei = idx;
					idx++;
				}
				cnt++;
			}
			idx++;

		}
		if (si == -1) {
			return 0;
		}

		int res = checkrange(str, si, ei);
		if (res == Integer.MAX_VALUE && sign == -1) {
			return Integer.MIN_VALUE;
		}

		return sign * res;
	}

	private static int checkrange(String str, int si, int ei) {

		long a = Long.parseLong(str.substring(si, ei + 1));

		if (a > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else {
			return (int) a;
		}

	}
}
