package leetcode;

public class subarrayproductlessthenk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numSubarrayProductLessThanK(int[] nums, int k) {

		int product = 1;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			product = 1;
			product *= nums[i];
			if (product < k) {
				count++;

			}
			if (product >= k) {
				continue;
			}

			for (int j = i + 1; j < nums.length; j++) {
				product *= nums[j];
				if (product < k) {
					count++;

				}
				if (product >= k) {
					break;
				}

			}
		}
		return count;
	}

}
