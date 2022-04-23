package leetcode;

public class findduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findDuplicate(int[] nums) {

		for (int i = 1; i < nums.length; i++) {
			int a = nums[i];
			if (a == i) {
				continue;

			} else {
				if (nums[a] == a) {
					return a;
				} else {
					swap(nums, i, a);
					i--;
				}

			}
		}
		return nums[0];
	}

	public void swap(int[] arr, int i, int j) {
		int jth = arr[j];
		int ith = arr[i];
		arr[j] = ith;
		arr[i] = jth;

	}

}
