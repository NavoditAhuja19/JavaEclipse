package leetcode;

import java.util.Stack;

public class validparenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.add(ch);
			} else if (ch == ')') {
				if(stack.size()==0) {
					stack.add(ch);
				}
				char check = stack.peek();
				if (check == '(') {
					stack.pop();
				} else {
					break;
				}
			} else if (ch == '}') {
				if(stack.size()==0) {
					stack.add(ch);
				}
				char check = stack.peek();
				if (check == '{') {
					stack.pop();
				} else {
					break;
				}
			} else if (ch == ']') {
				if(stack.size()==0) {
					stack.add(ch);
				}
				char check = stack.peek();
				if (check == '[') {
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
