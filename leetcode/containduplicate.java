package leetcode;

import java.util.HashMap;

public class containduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public static boolean containsDuplicate(int[] nums) {
	        HashMap<Integer,Boolean> map=new HashMap<>();
	        for(int i=0;i<nums.length;i++) {
	        	if(map.containsKey(nums[i])) {
	        		return false;
	        	}
	        	map.put(nums[i], true);
	        }
	        return true;
	    }

}
