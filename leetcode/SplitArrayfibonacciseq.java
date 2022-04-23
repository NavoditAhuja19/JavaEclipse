package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayfibonacciseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(splitIntoFibonacci("1101111"));

	}

	public static List<Integer> splitIntoFibonacci(String S) {
		List<Integer> main = new ArrayList<>();
		splitIntoFibonacci(S, new ArrayList<>(), main);
		return main;
	}

	private static void splitIntoFibonacci(String ques, List<Integer> temp, List<Integer> main) {

		if (ques.length() == 0) {
			 if(temp.size()>2&&main.size()==0) {

			// System.out.println(ans);
			
				  main.addAll(temp);
			 
			 }
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String part = ques.substring(0, i);
			String roq = ques.substring(i);

			if (inrange(part)) {

				int num = Integer.parseInt(part);
				if (isfibonacci(temp, num) && leadingzeroes(part)) {
					temp.add(num);

					splitIntoFibonacci(roq,  temp,main);

					temp.remove(temp.size() - 1);
				}
			}

		}

	}

	private static boolean leadingzeroes(String part) {
		if (part.length() > 1) {
			if (part.charAt(0) == '0') {
				return false;
			}

		}

		return true;
	}

	private static boolean isfibonacci(List<Integer> temp, int num) {
		if (temp.size() < 2) {
			return true;
		}
		int a = temp.get(temp.size() - 1);
		int b = temp.get(temp.size() - 2);
		return a + b == num;
	}

	private static boolean inrange(String part) {
		if (part.length() >= 11) {
			return false;
		}
		return Long.parseLong(part) <= Math.pow(2, 31) - 1;

	}

}
