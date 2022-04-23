package lect15;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 90, 50, 30, 80, 60, 20, 45, 10, 70, 25 };
		int[] ans = mergesort(arr, 0, arr.length - 1);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

	public static int[] mergetwosortedarrays(int[] one, int[] two) {
		int[] res = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				res[k++] = one[i++];
			} else {
				res[k] = two[j];
				k++;
				j++;
			}
		}

		while (i < one.length) {
			res[k++] = one[i++];
		}

		while (j < two.length) {
			res[k++] = two[j++];
		}

		return res;
	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;
		int[] fh = mergesort(arr, lo, mid);
		int[] sh = mergesort(arr, mid + 1, hi);
		int[] merged = mergetwosortedarrays(fh, sh);
		return merged;

	}

}
