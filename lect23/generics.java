package lect23;

import java.util.Arrays;

public class generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 40, 20, 300, 50 };

		Arrays.sort(arr);
		display(arr);
		Character[] arrr = { 'a', 'b', 'c', 'd' };
		display(arrr);
		car[] cars = new car[5];
		cars[0] = new car(1000, 2000, "red");
		cars[1] = new car(200, 500, "blue");
		cars[2] = new car(3000, 10, "green");
		cars[3] = new car(10, 3000, "orange");
		cars[4] = new car(500, 400, "black");
		// display(cars);
		Bubblesort(cars);
		display(cars);

	}

	public static <T> void display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> void Bubblesort(T[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < (arr.length - 1); j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
