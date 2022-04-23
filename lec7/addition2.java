package lec7;

import java.util.ArrayList;

public class addition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n = { 9, 9, 9, 9 };
		int[] m = { 7, 6 };

		addition(n, m);

	}

	public static void addition(int[] n, int[] m) {
		int i = n.length - 1;
		int j = m.length - 1;
		ArrayList<Integer> list = new ArrayList<>();
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum = sum + n[i];
			}
			if (j >= 0) {
				sum = sum + m[j];
			}
			carry = sum / 10;
			sum = sum % 10;
			list.add(0, sum);
			i--;
			j--;
		}
		
		if(carry > 0)
			list.add(0, carry);
		
		System.out.println(list);

	}
}
