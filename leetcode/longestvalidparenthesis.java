package leetcode;

import java.util.Stack;

public class longestvalidparenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestValidParenthesesBU(")()())");

	}

	public static int longestValidParentheses(String s) {
		int[][] strg = new int[s.length()][s.length()];
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				strg[i][j] = -1;
			}
		}
		return longestValidParenthesesBU(s);

	}

	private int longestValidParentheses(String s, int si, int ei) {

		if (si > ei) {
			return 0;
		}
		if (isValid(s, si, ei)) {
			return (ei - si) + 1;
		} else {
			int a = longestValidParentheses(s, si + 1, ei);
			int b = longestValidParentheses(s, si, ei - 1);
			return Math.max(a, b);
		}
	}

	private int longestValidParenthesesTD(String s, int si, int ei, int[][] strg) {

		if (si > ei) {
			return 0;
		}
		if (strg[si][ei] != -1) {
			return strg[si][ei];
		}
		if (isValid(s, si, ei)) {
			strg[si][ei] = (ei - si) + 1;
			return (ei - si) + 1;
		} else {
			int a = longestValidParenthesesTD(s, si + 1, ei, strg);
			int b = longestValidParenthesesTD(s, si, ei - 1, strg);
			strg[si][ei] = Math.max(a, b);
			return Math.max(a, b);
		}
	}

	private static int longestValidParenthesesBU(String s) {
		if (s.length() == 0) {
			return 0;
		}
		int[][] strg = new int[s.length() + 1][s.length() + 1];
		for (int si = s.length() - 1; si >= 0; si--) {
			for (int ei = si; ei < s.length(); ei++) {
				if (si >= ei) {
					strg[si][ei] = 0;
					continue;
				}

				if (checkValidString(s, si, ei, 0, 0)) {
					strg[si][ei] = (ei - si) + 1;

				} else {
					int a = strg[si + 1][ei];
					int b = strg[si][ei - 1];
					strg[si][ei] = Math.max(a, b);

				}

			}
		}
		return strg[0][s.length() - 1];
	}

	private static boolean checkValidString(String s, int vidx, int ei, int open, int close) {
		if (open > ((s.length() / 2) + 1) || close > ((s.length() / 2) + 1)) {
			return false;
		}
		if (close > open) {
			return false;
		}
		if (vidx == ei + 1 && open == close) {
			return true;
		}
		if (vidx > ei) {
			return false;
		}
		if (s.charAt(vidx) == '(') {

			if (checkValidString(s, vidx + 1, ei, open + 1, close))
				return true;
		} else {
			if (checkValidString(s, vidx + 1, ei, open, close + 1))
				return true;
		}
		return false;

	}

	public static boolean isValid(String s, int si, int ei) {

		Stack<Character> stack = new Stack<>();
		for (int i = si; i <= ei; i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				stack.add(ch);
				if (stack.size() > (((ei - si + 1) / 2) + 1)) {
					break;
				}
			} else if (ch == ')') {
				if (stack.size() == 0) {
					stack.add(ch);
				}
				char check = stack.peek();
				if (check == '(') {
					stack.pop();
				} else {
					break;
				}
			}
		}
		if (stack.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

}
