package leetcode;

public class removeduplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int removeDuplicates(int[] nums) {
		  int cnt=0;
		  int valcnt=0;
		  for(int i=0;i<nums.length;i++) {
			  if(i==0||nums[i]==nums[i-1]&&valcnt<2||nums[i]!=nums[i-1]) {
				  if(i!=0&&nums[i]!=nums[i-1]) {
					  valcnt=0;
				  }
				  nums[cnt]=nums[i];
				  valcnt++;
				  cnt++;
			  }
		  }
		  return cnt;
	        
	    }

}
