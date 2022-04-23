package lec9;

public class findall_indexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 30, 20, 30, 20 };

		int item = 30;
		int idx = 0;
		int[] pos = allindex(arr, item, idx, 0);

		for (int i = 0; i < pos.length; i++) {
			System.out.println(pos[i]);
		}

	}

	public static int[] allindex(int[] arr, int item, int i, int count) {
		if (i == arr.length) {
			int[] br = new int[count];
			return br;
		}
		if (arr[i] == item) {
			int[] rr = allindex(arr, item, i + 1, count + 1);
			rr[count] = i;
			return rr;
		} else {
			int[] rr = allindex(arr, item, i + 1, count);
			return rr;
		}

	}

}
