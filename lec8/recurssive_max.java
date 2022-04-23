package lec8;

public class recurssive_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 90, 130, 70 };

		int temp = arr[0];
		int idx = 1;
		max(arr, temp, idx);

	}

	public static void max(int[] arr, int temp, int i) {

		if (i == arr.length) {
			System.out.println(temp);

			return;

		}
		if (arr[i] > temp) {
			temp = arr[i];
		}

		max(arr, temp, i + 1);

	}

}
