package leetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1,1};
	
	System.out.println(maxArea(arr));
	}
	

	public static int maxArea(int[] height) {

		int i = 0;
		int j = height.length - 1;
		int max = Integer.MIN_VALUE;
		while (i < j) {
			int a = height[i];
			int b = height[j];
			int length = j - i;
			int area = (Math.min(a, b) * length);
			if (max < area) {
				max = area;
			}
			if (a <= b) {
				i++;
			} else {
				j--;
			}

		}
		return max;

	}

}
