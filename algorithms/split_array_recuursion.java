package algorithms;

import java.util.Scanner;

public class split_array_recuursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}
		System.out.println(array_recursion(arr, "", 0, "", 0, 0));

	}

	public static int array_recursion(int[] arr, String ans1, int sum1, String ans2, int sum2, int vidx) {
		if (arr.length == vidx) {
			if (sum1 == sum2) {
				System.out.println(ans1 + " and " + ans2);
				return 1;
			}
			return 0;
		}
		int count = 0;

		count += array_recursion(arr, ans1 +" "+ arr[vidx], sum1 + arr[vidx], ans2, sum2, vidx + 1);
		count += array_recursion(arr, ans1, sum1, ans2 + " " +arr[vidx], sum2 + arr[vidx], vidx + 1);
		return count;
	}

}
