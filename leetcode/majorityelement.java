package leetcode;

import java.util.HashMap;

public class majorityelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int majorityElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int n = nums.length;
		for (int i = 0; i < nums.length; i++) {
			int ov = map.getOrDefault(nums[i], 0);
			map.put(nums[i], ov + 1);
		}
		int ele=-1;
		int max = Integer.MIN_VALUE;
		for (int key : map.keySet()) {
			if (max < map.get(key)) {
				max = map.get(key);
				ele=key;
			}
		}
		if (max > n / 2) {
			return ele;
		} else {
			return 0;
		}
	}

}
