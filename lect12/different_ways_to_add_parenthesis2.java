package lect12;

import java.util.ArrayList;

import lec7.string_comparison;

public class different_ways_to_add_parenthesis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(differentwaystoaddparenthesis("2*3-4*5"));

	}

	public static ArrayList<String> differentwaystoaddparenthesis(String ques) {
		ArrayList<String> mr = new ArrayList<>();
		// base case
		if (ques.indexOf('+') == -1 && ques.indexOf('-') == -1 && ques.indexOf('*') == -1) {
			mr.add(ques);
			return mr;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*') {
				String part1 = ques.substring(0, i);
				String part2 = ques.substring(i + 1);
				ArrayList<String> rr1 = differentwaystoaddparenthesis(part1);
				ArrayList<String> rr2 = differentwaystoaddparenthesis(part2);
				for (String val1 : rr1) {
					for (String val2 : rr2) {
						if (ch == '+') {
							mr.add("(" + val1 + "+" + val2 + ")");
						} else if (ch == '-') {
							mr.add("(" + val1 + "-" + val2 + ")");
						} else if (ch == '*') {
							mr.add("(" + val1 + "*" + val2 + ")");
						}

					}
				}

			}

		}

		return mr;
	}

}
