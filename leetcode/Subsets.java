package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3 };
		System.out.println(subsets(nums));
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> main = new ArrayList<>();
		subsets(nums, 0, main, new ArrayList<>());
		return main;
	}

	private static void subsets(int[] nums, int index, List<List<Integer>> main, List<Integer> temp) {

		main.add(new ArrayList<>(temp));
		for (int i = index; i < nums.length; i++) {

			temp.add(nums[i]);
			subsets(nums, i + 1, main, temp);

			temp.remove(temp.size() - 1);

		}

	}

}
