package leetcode;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

public class additiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAdditiveNumber("00112"));

	}

	public static boolean isAdditiveNumber(String S) {

		return isAdditiveNumber(S, new ArrayList<>());

	}

	private static boolean isAdditiveNumber(String ques, List<BigInteger> temp) {

		if (ques.length() == 0) {
			if (temp.size() > 2) {
				return true;

			}
			return false;
		}
		boolean fr = false;
		for (int i = 1; i <= ques.length(); i++) {
			String part = ques.substring(0, i);
			String roq = ques.substring(i);

			BigInteger num = new BigInteger(part);
			if (isaddictive(temp, num) && leadingzeroes(part)) {
				temp.add(num);

				boolean sr = isAdditiveNumber(roq, temp);

				fr = sr || fr;
				temp.remove(temp.size() - 1);
			}

		}
		return fr;

	}

	private static boolean leadingzeroes(String part) {
		if (part.length() > 1) {
			if (part.charAt(0) == '0') {
				return false;
			}

		}

		return true;
	}

	private static boolean isaddictive(List<BigInteger> temp, BigInteger num) {
		if (temp.size() < 2) {
			return true;
		}
		BigInteger a = temp.get(temp.size() - 1);
		BigInteger b = temp.get(temp.size() - 2);
		return (a.add(b)).compareTo(num)==0;
	}

}
