package lec8;

public class find_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 90, 130, 20 };

		int item = 20;
		int idx = 0;
		index(arr, item, idx);

	}

	public static void index(int[] arr, int item, int i) {
		if (i == arr.length) {
			System.out.println(-1);
			return;
		}
		if (arr[i] == item) {
			System.out.println(i);
			return;
		}
		index(arr, item, i + 1);
	}

}
