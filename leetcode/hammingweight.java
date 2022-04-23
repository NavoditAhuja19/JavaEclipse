package leetcode;

public class hammingweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	hammingWeight(11111101);
	}
	
	 public  int hammingWeight(int n) //bst approach
	    {
	    int ans=0;
	     while(n!=0)
	     {
	         n=n&(n-1);//n and n-1
	         ans++;
	     }
	   //  System.out.println(ans);
	     return ans; 
	    }

	 public int brutehamming(int n) {
		 int cnt=0;
		 while(n>0) {
			 cnt=cnt+(n%2);
			 n=n/2;
		 }
		 return cnt;
		 
	 }
	 public int hamming2(int n) {
		 int ans=0;
		    for(int i=0;i<32;i++)
		    {
		        ans=ans+(n&1);
		        n=n>>1;//right shift
		    }
		    return ans;
	 }

}
