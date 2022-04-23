package algorithms;

import java.util.Scanner;

public class painterprob {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int painter = scn.nextInt();
			int nob = scn.nextInt();
			int[] boards = takeinput(nob);

			int lo = boards[boards.length-1  ];
			int sum=0;
			for(int j=0;j<boards.length;j++)
				sum+=boards[j];
			int hi = sum;

			int ans = 0;
			while (lo <= hi) {
				int mid = lo + ((hi - lo) / 2);
				if (isitpossible(boards, painter, mid)) {

					ans = mid;
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			}
			System.out.println(ans);
		}
	

	public static int[] takeinput(int n) {

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

	public static boolean isitpossible(int[] boards, int nop, int cap) {
		int painters = 1;
		int boardspainted = 0;
		int currboard = 0;
		while (currboard < boards.length) {
			if (boards[currboard] + boardspainted <= cap) {
				boardspainted += boards[currboard];
				currboard++;
			} else {
				painters++;
				boardspainted = 0;
			}
			if (painters > nop)
				return false;

		}

		return true;
	}
}
