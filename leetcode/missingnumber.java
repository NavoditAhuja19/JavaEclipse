package leetcode;

import java.util.HashMap;

public class missingnumber {
	  public int missingNumber(int[] nums) {
		   HashMap<Integer, Boolean> map=new HashMap<>();
			  for(int i=0;i<nums.length;i++) {
				  map.put(nums[i], true);
			  }
			  for(int i=0;i<nums.length;i++) {
				  if(map.containsKey(i)) {
					  continue;
				  }else {
					  return i;
				  }
			  }
			  return nums.length;    
	    }

}
