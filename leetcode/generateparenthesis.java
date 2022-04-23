package leetcode;

import java.util.ArrayList;
import java.util.List;

public class generateparenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(generateParenthesis(3));
	}

	public static List<String> generateParenthesis(int n) {

		List<String> main = new ArrayList<>();

		
		generateParenthesis(n, 0, 0, "",main);
		return main;
	}

	private static void generateParenthesis(int n, int open, int close, String str, List<String> main) {

		if(open>n||close>n) {
			return;
		}
		if(close>open) {
			return;
		}
		if(close==n&&open==n) {
			main.add(str);
		}
		generateParenthesis(n, open + 1, close, str + "(",main);
		generateParenthesis(n, open, close + 1, str + ")",main);
	}

}
