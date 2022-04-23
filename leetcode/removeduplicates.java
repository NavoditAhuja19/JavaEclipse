package leetcode;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int removeDuplicates(int[] nums) {
		  int cnt=0;
		  for(int i=0;i<nums.length;i++) {
			  if(i==0||nums[i]!=nums[i-1]) {
				  nums[cnt]=nums[i];
				  cnt++;
			  }
		  }
		  return cnt;
	        
	    }

}
