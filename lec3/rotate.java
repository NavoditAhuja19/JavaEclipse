package lec3;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("enter rotations");
		int r = scn.nextInt();

		int num, cnt = 0;
		int newn = n;
		int rot=r;
		while (newn > 0) {

			newn = newn / 10;
			cnt++;

		}
		System.out.println(cnt);
		if (r > 0) {
			while (r >= 1)

			{
				int ans = (int) Math.pow(10, cnt - 1);

				int rem = n % 10;
				n = n / 10;
				num = rem * ans + n;
				

				n = num;

				r = r - 1;

			}
		} else {
			while (r < 0) {
				int a = (int) Math.pow(10, cnt - 1);
				int rem = n % a;
				n = n / a;
				num = n + rem * 10;
		
				n = num;
				r = r + 1;

			}
		}
		System.out.println(rot +" rotation is " + n);

	}

}
