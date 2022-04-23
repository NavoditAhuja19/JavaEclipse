package leetcode;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class combinationsum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(combinationSum3(3, 9));
	}

	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> main = new ArrayList<>();
		combinationSum3(k, n, 1, main, new ArrayList<>());

		return main;
	}

	private static void combinationSum3(int k, int n, int value, List<List<Integer>> main, List<Integer> temp) {

		if (n == 0 && k == 0) {
			main.add(new ArrayList<>(temp));
			return;
		}
		if (n < value) {
			return;
		}
		for (int i = value; i <= 9; i++) {
			temp.add(i);
			combinationSum3(k - 1, n - i, i+1, main, temp);
			temp.remove(temp.size() - 1);
		}

	}

}
