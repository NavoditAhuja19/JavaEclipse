package leetcode;

import java.util.ArrayList;
import java.util.List;

public class findallduplicates {
	  public List<Integer> findDuplicates(int[] nums) {
		  List<Integer> ret=new ArrayList<>();
		  for(int i=0;i<nums.length;i++) {
			  int val=Math.abs(nums[i])-1;
			  if(nums[val]>0) {
				  nums[val]=-nums[val];
			  }
			  else if(nums[val]<0) {
				  ret.add(-nums[val]+1);
			  }
			  
		  }
		  
		  
		  return ret;
	    }
}
