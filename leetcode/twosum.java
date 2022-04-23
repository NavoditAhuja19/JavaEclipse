package leetcode;

import java.util.HashMap;

public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(target-nums[i], i);
		}
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])&&map.get(nums[i])!=i) {
				arr[0]=i;
				arr[1]=map.get(nums[i]);
			}
		}

		return arr;

	}

}
