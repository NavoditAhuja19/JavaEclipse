package algorithms;

import java.util.Scanner;

public class book_allocation2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int b = scn.nextInt();
			int st = scn.nextInt();
			int[] books = takeinput(b);

			int lo = books[books.length-1  ];
			int sum=0;
			for(int j=0;j<books.length;j++)
				sum+=books[j];
			int hi = sum;

			int ans = 0;
			while (lo <= hi) {
				int mid = lo + (hi - lo) / 2;
				if (isitpossible(books, st, mid)) {

					ans = mid;
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			}
			System.out.println(ans);
		}
	}

	public static int[] takeinput(int n) {

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

	public static boolean isitpossible(int[] books, int st, int cap) {
		int students = 1;
		int pagesread = 0;
		int currbook = 0;
		while (currbook < books.length) {
			if (books[currbook] + pagesread <= cap) {
				pagesread += books[currbook];
				currbook++;
			} else {
				students++;
				pagesread = 0;
			}
			if (students > st)
				return false;

		}

		return true;
	}
}
