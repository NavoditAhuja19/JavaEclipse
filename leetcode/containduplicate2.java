package leetcode;

import java.util.HashMap;

public class containduplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int prev = map.get(nums[i]);
				if (i - prev <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;

	}

}
