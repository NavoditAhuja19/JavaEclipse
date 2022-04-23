package lec5;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void insertionsort(int[] arr) {
		for (int counter = 1; counter < arr.length; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
	}

}
