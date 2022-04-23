package leetcode;

public class climbstairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(climbStairs(45));
	}
	 public static int climbStairs(int n) {
	       // return climbStairs(n,0);
	 return CSBU(n, new int[n+2])  ; 
	 }
	private static int climbStairs(int n, int bottom) {
		if(bottom==n) {
			return 1;
		}
		if(bottom>n) {
			return 0;
		}
		int count=0;
		count+=climbStairs(n,bottom+1);
		count+=climbStairs(n, bottom+2);
		return count;
	}
	private static int CSTD(int n, int bottom,int[] strg) {
		if(bottom==n) {
			return 1;
		}
		if(bottom>n) {
			return 0;
		}
		if(strg[bottom]!=0) {
			return strg[bottom];
		}
		int count=0;
		count+=CSTD(n,bottom+1,strg);
		count+=CSTD(n, bottom+2,strg);
		strg[bottom]=count;
		return count;
	}
	private static int CSBU(int n,int[] strg) {
		strg[n+1]=0;
		strg[n]=1;
		for(int i=n-1;i>=0;i--) {
			strg[i]=strg[i+1]+strg[i+2];
		}
		return strg[0];
	}

}
