package lec1;


public class rev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n = 1234;
		int b=0;

		while (n > 0) {
			int a= n % 10;
			b=b*10+a;
			n = n / 10;
		}

		
		System.out.println(b);

	}

}
