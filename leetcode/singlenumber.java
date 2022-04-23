package leetcode;

import java.util.HashMap;

public class singlenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,2,1};
		System.out.println(singleNumber(nums));

	}
	  public static int singleNumber(int[] nums) {
		  HashMap<Integer, Integer> map=new HashMap<>();
		  for(int i=0;i<nums.length;i++) {
			  int ov=map.getOrDefault(nums[i], 0);
			  map.put(nums[i], ov+1);
		  }
		  int ans=-1;
		  for(int key:map.keySet()) {
			  if(map.get(key)==1) {
				  ans=key;
			  }
		  }
	        return ans;
	    }
	   public static int[] singleNumber3(int[] nums) {
		   HashMap<Integer, Integer> map=new HashMap<>();
			  for(int i=0;i<nums.length;i++) {
				  int ov=map.getOrDefault(nums[i], 0);
				  map.put(nums[i], ov+1);
			  }
			  int cnt=0;
			  for(int key:map.keySet()) {
				  if(map.get(key)==1) {
					 cnt++;
				  }
			  }
			 
	        int[] arr=new int[cnt];
	        cnt=0;
	        for(int key:map.keySet()) {
				  if(map.get(key)==1) {
					  arr[cnt]=key;
					 cnt++;
				  }
			  }
	        return arr;
	    }

}
