package lec8;

public class find_index2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 90, 130, 20 };

		int item = 90;
		int idx = 0;
		int pos = index(arr, item, idx);
		System.out.println(pos);

	}

	public static int index(int[] arr, int item, int i) {
		if (i == arr.length) {
			// System.out.println(-1);
			return -1;
		}
		if (arr[i] == item) {
			// System.out.println(i);
			return i;
		}

		return index(arr, item, i + 1);
		// int res=index(arr,item.i+1);
		// return res;
	}

}
