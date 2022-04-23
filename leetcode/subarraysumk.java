package leetcode;

public class subarraysumk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int subarraySum(int[] nums, int k) {

		int sum = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			sum = 0;
			sum += nums[i];
			if (sum == k) {
				count++;

			}

			for (int j = i + 1; j < nums.length; j++) {
				sum += nums[j];
				if (sum == k) {
					count++;

				}

			}
		}
		return count;
	}

}
