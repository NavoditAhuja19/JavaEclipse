package lec1;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, l;
		int n=5;
		for (i = 0; i <= n; i++) {
			for(l=0;l<=i;l++)
				System.out.print(" ");
			for (j = 2 * (n - i); j >= 0; j = j - 1) {
		
			
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
