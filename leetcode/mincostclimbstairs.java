package leetcode;

import java.util.Collections;

public class mincostclimbstairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] cost= {10,15,20};
	
		System.out.println(minCostClimbingStairs(cost));
		}
	
	  public static int minCostClimbingStairs(int[] cost) {
	        int[] strg=new int[cost.length];
	       for(int i=0;i<strg.length;i++) {
	    	   strg[i]=-1;
	       }
	     int zero=MCCSTD(cost, 0, strg);
	     int one=MCCSTD(cost, 1, strg);
		// int zero= minCostClimbingStairs(cost,0);
		// int one=minCostClimbingStairs(cost, 1);
		 return Math.min(zero, one);
	    }
	private static int minCostClimbingStairs(int[] cost, int bottom) {
		if(bottom==cost.length) {
			return 0;
		}
		if(bottom==cost.length-1) {
			return cost[bottom];
		}
		int one=minCostClimbingStairs(cost, bottom+1);
		int two=minCostClimbingStairs(cost, bottom+2);
		return Math.min(one, two)+cost[bottom];
	}
	private static int MCCSTD(int[] cost, int bottom,int[] strg) {
		if(bottom==cost.length) {
			return 0;
		}
		if(bottom==cost.length-1) {
			return cost[bottom];
		}
		if(strg[bottom]!=-1) {
			return strg[bottom];
		}
		int one=MCCSTD(cost, bottom+1,strg);
		int two=MCCSTD(cost, bottom+2,strg);
		strg[bottom]=Math.min(one, two)+cost[bottom];
		return Math.min(one, two)+cost[bottom];
	}

}
