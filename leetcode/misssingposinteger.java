package leetcode;

import java.util.HashMap;

public class misssingposinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
  public int firstMissingPositive(int[] nums) {
		  
		  HashMap<Integer, Boolean> map=new HashMap<>();
		  for(int i=0;i<nums.length;i++) {
			  map.put(nums[i], true);
		  }
		  for(int i=1;i<Integer.MAX_VALUE;i++) {
			  if(map.containsKey(i)) {
				  continue;
			  }else {
				  return i;
			  }
		  }
		  return -1;
	        
	    }

}
