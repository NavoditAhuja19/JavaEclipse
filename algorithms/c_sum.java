package algorithms;

import java.util.Scanner;

public class c_sum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = takeinput();
		int c[] = c_sum(a);
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			
			sum = (sum + c[i]) % 1_000_000_007;
		}
		sum = sum % (1_000_000_0);
		System.out.println(sum);

	}

	public static int[] takeinput() {

		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}

		return arr;
	}

	public static int[] c_sum(int[] arr) {
		int t = scn.nextInt();
		int c[] = new int[arr.length];
		for (int j = 0; j < t; j++) {
			int op = scn.nextInt();
			op=op%arr.length;

			for (int i = 0; i < arr.length; i++) {
				int d = i - op;
				if (d < 0)
					d = d + arr.length;
				else if (d == 0)
					d = i - op;
				else
					d = i - op;
				c[i] = (arr[d]% 1_000_000_007 + arr[i] % 1_000_000_007)% 1_000_000_007;
			}
			arr = c;
		}
		return arr;

	}
}
