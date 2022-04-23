package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class foursum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 0, -1, 0, -2, 2 };

		System.out.println(fourSum(nums, 0));
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> main = new ArrayList<>();
		Arrays.sort(nums);

		QuadPairs(nums, target, main, new ArrayList<>());
		return main;

	}

	public static void QuadPairs(int[] arr, int target, List<List<Integer>> main, List<Integer> temp) {

		for (int l = 0; l < arr.length - 1; l++) {

			for (int i = l + 1; i < arr.length - 1; i++) {
				if ((i > l + 1 && arr[i] == arr[i - 1])) {
					continue;
				}

				int j = i + 1;
				int k = arr.length - 1;

				while (j < k) {
					temp = new ArrayList<>();
					if (j > i + 1 && arr[j] == arr[j - 1]) {
						j++;
						continue;
					}
					if (k < arr.length && arr[k] == arr[k + 1]) {
						k--;
						continue;
					}

					int sum = arr[i] + arr[j] + arr[k] + arr[l];

					if (sum > target) {

						k--;
					} else if (sum < target) {
						j++;
					} else {

						// System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
						temp.add(arr[l]);
						main.add(new ArrayList<>(temp));

						j++;
						k--;

					}

				}

			}
		}
	}
}
