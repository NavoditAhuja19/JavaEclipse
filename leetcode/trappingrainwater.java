package leetcode;

public class trappingrainwater {
	public  int trap(int[] hieght) {

		int[] leftmax = new int[hieght.length];
		int[] rightmax = new int[hieght.length];
		leftmax[0] = hieght[0];
		for (int i = 1; i < hieght.length; i++) {
			leftmax[i] = Math.max(hieght[i], leftmax[i - 1]);
		}
		rightmax[hieght.length - 1] = hieght[hieght.length - 1];
		for (int i = hieght.length - 2; i >= 0; i--) {
			rightmax[i] = Math.max(hieght[i], rightmax[i + 1]);
		}
		int water = 0;
		for (int i = 1; i < hieght.length - 1; i++) {

			water = water + Math.min(leftmax[i], rightmax[i]) - hieght[i];

		}
		return water;

	}


}
