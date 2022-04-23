package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class threesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(nums));

	}
	   public  static List<List<Integer>> threeSum(int[] nums) {
		   List<List<Integer>> main=new ArrayList<>();
		  Arrays.sort(nums);
		  
		   TripletPairs(nums,0,main,new ArrayList<>());
		   return main;
				   
	    }

	public static void TripletPairs(int[] arr, int target,List<List<Integer>> main,List<Integer> temp) {

		for (int i = 0; i < arr.length; i++) {
			if(i>0&&arr[i]==arr[i-1]) {
				continue;
			}

			int j = i + 1;
			int k = arr.length - 1;

			while (j < k) {
				temp=new ArrayList<>();
				if(j>i+1&&arr[j]==arr[j-1]) {
					j++;
					continue;
				}
				

				int sum = arr[i] + arr[j] + arr[k];

				if (sum > target) {

					k--;
				} else if (sum < target) {
					j++;
				} else {

					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					temp.add(arr[i]);
					temp.add(arr[j]);
					temp.add(arr[k]);
					main.add(new ArrayList<>(temp));
					
					
					j++;
					k--;
					
				}

			}

		}
	}

}
