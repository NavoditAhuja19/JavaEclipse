package lec3;

import java.util.Scanner;

public class rotate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("enter rotations");
		int r = scn.nextInt();

		int num, cnt = 0;
		int newn = n;
		while (newn > 0) {

			newn = newn / 10;
			cnt++;

		}
		r=r%cnt;
		if(r<0)
			r=r+cnt;
		int a=(int)Math.pow(10, r);
		int b=(int)Math.pow(10, cnt-r);
		int rem=n%a;
		int part=n/a;
		int ans=rem*b+part;
		System.out.println(ans);

	}

}
