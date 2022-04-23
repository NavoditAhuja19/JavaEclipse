package leetcode;

public class validtrianglenumber {
	public int triangleNumber(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int s1 = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				int s2 = nums[j];
				for (int k = j + 1; k < nums.length; k++) {

					int s3 = nums[k];
					if (s1 + s2 <= s3) {
						continue;
					}
					if (s3 + s2 <= s1) {
						continue;
					}
					if (s1 + s3 <= s2) {
						continue;
					}
					count++;
				}
			}
		}

		return count;

	}
}
