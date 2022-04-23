package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class coinchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int target = scn.nextInt();
		int size = scn.nextInt();
		int[] candidates = new int[size];
		for (int i = 0; i < size; i++) {
			candidates[i] = scn.nextInt();
		}
		Arrays.sort(candidates);

		boolean[] check = new boolean[candidates.length];
		Arrays.fill(check, true);
		System.out.println(coinchange(candidates, target, 0));

	}

	private static int coinchange(int[] candidates, int target, int idx) {

		if (target == 0) {

			return 1;
		}
		if (target < 0 || idx == candidates.length) {
			return 0;
		}
		int sum = 0;
		for (int i = idx; i < candidates.length; i++) {
			if(i==idx||candidates[i]!=candidates[i-1])

			sum += coinchange(candidates, target - candidates[i], i);

		}
		return sum;

	}

}
