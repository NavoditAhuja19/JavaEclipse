package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class palindromepartitioning2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int j = 0; j < t; j++) {
			String str = scn.next();
			int[][] strg = new int[str.length()][str.length()];

			for (int i = 0; i < strg.length; i++) {
				Arrays.fill(strg[i], -1);
			}
			System.out.println(minCutTD(str, 0, str.length() - 1, strg));
		}
	}

	static int min;

	public static int minCut(String str, int si, int ei) {
		if (ispalindrome(str, si, ei)) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int k = si; k < ei; k++) {
			int fp = minCut(str, si, k);
			int sp = minCut(str, k + 1, ei);
			int total = fp + sp + 1;
			if (total < min) {
				min = total;
			}
		}
		return min;

	}

	public static int minCutTD(String str, int si, int ei, int[][] strg) {
		if (ispalindrome(str, si, ei)) {
			return 0;
		}
		if (strg[si][ei] != -1) {
			return strg[si][ei];
		}
		int min = Integer.MAX_VALUE;
		for (int k = si; k < ei; k++) {
			int fp = minCutTD(str, si, k, strg);
			int sp = minCutTD(str, k + 1, ei, strg);
			int total = fp + sp + 1;
			if (total < min) {
				min = total;
			}
		}
		strg[si][ei] = min;
		return min;

	}

	private static boolean ispalindrome(String str, int si, int ei) {
		for (int i = si, j = ei; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
