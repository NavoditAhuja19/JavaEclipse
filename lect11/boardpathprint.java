package lect11;

import java.util.Scanner;

public class boardpathprint {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sizeofboard=scn.nextInt();
		int nod=scn.nextInt();
		
	int d=boardpath(0, sizeofboard,nod, "", 0);
	System.out.println();
	System.out.println(d);

	}

	public static int boardpath(int curr, int end,int nod, String ans, int count) {
		if (curr == end) {
			count++;
			System.out.print(ans + " ");
			return count;
		}
		
		for (int dice = 1; dice <= nod && dice + curr <= end; dice++) {
			count = boardpath(curr + dice, end,nod, ans + dice, count);
		}
		return count;
	}

}
