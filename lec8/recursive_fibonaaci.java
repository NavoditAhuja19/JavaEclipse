package lec8;

public class recursive_fibonaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=fibonaaci(7);
		System.out.println(f);

	}
	public static int fibonaaci(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		int f=fibonaaci(n-1)+fibonaaci(n-2);
		
		
		
		
		
		
		
		
		return f;
	}

}
