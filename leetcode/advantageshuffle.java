package leetcode;

import java.util.Arrays;

public class advantageshuffle {
	public int[] advantageCount(int[] A, int[] B) {
		Arrays.sort(A);
		for (int i = 0; i < B.length; i++) {
			int value = B[i];
			for (int j = i; j < A.length; j++) {
				if (A[j] > value) {
					int temp = A[j];
					A[j] = A[i];
					A[i] = temp;
					break;
				}
			}
			
			Arrays.sort(A, i + 1, A.length);
		}
		return A;
	}

}
