package leetcode;

public class regularexpressionmatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static boolean isMatch(String s, String p) {
		
		return isMatch(s, p, 0, 0);
	}

	private static boolean isMatch(String s, String p, int vidx1, int vidx2) {

		if (vidx1 == s.length() && vidx2 == p.length()) {
			return true;
		}
		if (vidx1 == s.length() && vidx2 != p.length()) {

			for (int i = vidx2; i < p.length(); i++) {
				if (p.charAt(i) != '*')
					return false;
			}
			return true;
		}
		if (vidx1 != s.length() && vidx2 == p.length()) {
			return false;
		}

		char ch1 = s.charAt(vidx1);
		char ch2 = p.charAt(vidx2);

		boolean ans = false;

		if (ch1 == ch2 || ch2 == '.') {
			ans = isMatch(s, p, vidx1 + 1, vidx2 + 1);
		}
		else if (ch2 == '*') {

			boolean blank = isMatch(s, p, vidx1, vidx2 + 1);
			boolean multiple = isMatch(s, p, vidx1 + 1, vidx2);

			
				ans = blank||multiple;
		
		}
		

		return ans;

	}

}
