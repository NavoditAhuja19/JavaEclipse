package leetcode;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class setmismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] findErrorNums(int[] nums) {
		 Arrays.sort(nums);
		 int[] arr=new int[2];
		 HashMap<Integer, Boolean> map=new HashMap<>();
		 for(int i=0;i<nums.length;i++) {
			 if(i>0&&nums[i]==nums[i-1]) {
				 arr[0]=nums[i];
				 
				// arr[1]=i;
			 }
			 map.put(nums[i], true);
		 }
		 for(int i=1;i<=nums.length;i++) {
			 if(!map.containsKey(i)) {
				 arr[1]=i;
			 }
		 }
		 return arr;
		
	        
	    }
	 

}
