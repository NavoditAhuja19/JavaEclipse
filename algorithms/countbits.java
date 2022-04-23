package algorithms;

public class countbits {
	public static void main(String[] args) {
		System.out.println(solution(1, 100000));
	}
	public static int solution(long A, long B) {
        // write your code in Java SE 8
        long n=A*B;
        
		long ans = 0;
		long mul = 1;
		while (n > 0) {
			long rem = n % 2;
			ans = ans + rem * mul;
			mul = mul * 10;
			n = n / 2;
		}
		System.out.println(ans);
		long n1=ans;
		int cnt=0;
		while(n1>0) {
			long rem=n1%10;
			if(rem==1) {
				cnt++;
			}
			n1=n1/10;
		}
		return cnt;
    }

}
