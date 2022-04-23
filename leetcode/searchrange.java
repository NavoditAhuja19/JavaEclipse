package leetcode;

import java.util.Arrays;

public class searchrange {
	public int[] searchRange(int[] nums, int target) {
		int[] arr = new int[2];
		Arrays.fill(arr, -1);
		int cnt = -1;
		int flag=0;
		while (cnt < nums.length) {

		
			if (cnt>=0&&nums[cnt] == target) {
				arr[0] = cnt;
				cnt++;
				flag=1;
				break;
			}
			cnt++;
		}
		if(flag==0) {
			return arr;
		}

		while (cnt < nums.length) {
			if (nums[cnt] != nums[cnt - 1]) {
				break;
			}
			cnt++;
		}
		arr[1] = cnt;
		return arr;
	}

}
