package lec8;

public class find_last_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 30, 30, 30, 20 };

		int item = 30;
		int idx = 0;
		int pos = lindex(arr, item, idx);
		System.out.println(pos);

	}

	public static int lindex(int[] arr, int item, int i) {
		if (i == arr.length) {
			return -1;
		}
		int res = lindex(arr, item, i + 1);

		if (arr[i] == item && res == -1) {
			return i;
		}

		return res;
	}

}
