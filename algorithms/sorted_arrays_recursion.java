package algorithms;

import java.util.Scanner;

public class sorted_arrays_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
			
		}
	
		for(int i=0;i<m;i++) {
			b[i]=scn.nextInt();
		}
		sortedarrya(a, b, new int[a.length+b.length], 0, 0, 0, false);

	}

	public static void sortedarrya(int a[], int b[], int c[], int i, int j, int len, boolean lasta) {
		if (!lasta) {
			if(len!=0)
			print(c, len);
			for (int k = i; k < a.length; k++) {
				if (len == 0) {
					c[len] = a[k];
					sortedarrya(a, b, c, i+ 1, j, len, true);
				} else {
					if (a[k] > c[len]) {
						c[len + 1] = a[k];
						sortedarrya(a, b, c, i + 1, j, len + 1, true);
					}
				}
			}
		} else {
			for (int k = j; k < b.length; k++) {
				if (b[k] > c[len]) {
					c[len + 1] = b[k];
					sortedarrya(a, b, c, i, j+ 1, len + 1, false);
				}
			}

		}
	}

	public static void print(int[] c, int len) {
		for (int i = 0; i <= len; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
	}

}