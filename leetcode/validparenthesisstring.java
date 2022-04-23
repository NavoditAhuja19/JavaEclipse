package leetcode;

public class validparenthesisstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean checkValidString(String s) {

		return checkValidString(s, 0, 0, 0);

	}

	private boolean checkValidString(String s, int vidx, int open, int close) {
		if(close>open) {
			return false;
		}
		if(vidx==s.length()&&open==close) {
			return true;
		}
		if(vidx>=s.length()) {
			return false;
		}
		if (s.charAt(vidx) == '(') {

			if (checkValidString(s, vidx + 1, open + 1, close))
				return true;
		} else if (s.charAt(vidx) == ')') {
			if (checkValidString(s, vidx + 1, open, close + 1))
				return true;
		} else {

			if (checkValidString(s, vidx + 1, open, close)) {
				return true;
			}

			if (checkValidString(s, vidx + 1, open+1, close)) {
				return true;
			}
			if (checkValidString(s, vidx + 1, open, close+1)) {
				return true;
			}
		}
		return false;

	}
}
