package leetcode;

public class wildcardmatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isMatch("adceb", "*a*b"));
	}

	public static boolean isMatch(String s, String p) {
		
		return isMatchTD(s, p, 0, 0,new int[s.length()][p.length()]);
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

		if (ch1 == ch2 || ch2 == '?') {
			ans = isMatch(s, p, vidx1 + 1, vidx2 + 1);
		}
		else if (ch2 == '*') {

			boolean blank = isMatch(s, p, vidx1, vidx2 + 1);
			boolean multiple = isMatch(s, p, vidx1 + 1, vidx2);

			
				ans = blank||multiple;
		
		}
		else {
			ans=false;
		}

		return ans;

	}
	private static boolean isMatchTD(String s, String p, int vidx1, int vidx2,int[][] strg) {

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
		if(strg[vidx1][vidx2]!=0) {
			if(strg[vidx1][vidx2]==2) {
				return true;
			}
			if(strg[vidx1][vidx2]==1) {
				return false;
			}
		}

		char ch1 = s.charAt(vidx1);
		char ch2 = p.charAt(vidx2);

		boolean ans = false;

		if (ch1 == ch2 || ch2 == '?') {
			ans = isMatchTD(s, p, vidx1 + 1, vidx2 + 1,strg);
		}
		else if (ch2 == '*') {

			boolean blank = isMatchTD(s, p, vidx1, vidx2 + 1,strg);
			boolean multiple = isMatchTD(s, p, vidx1 + 1, vidx2,strg);

			
				ans = blank||multiple;
		
		}
		else {
			ans=false;
		}
		if(ans) {
			strg[vidx1][vidx2]=2;
		}
		else {
			strg[vidx1][vidx2]=1;
			
		}

		return ans;

	}

}
