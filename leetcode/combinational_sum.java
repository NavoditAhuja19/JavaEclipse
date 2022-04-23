package leetcode;

import java.util.ArrayList;
import java.util.List;

public class combinational_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates= {2,3,6,7};
		int target=7;
		System.out.println(combinationSum(candidates, target));

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> main = new ArrayList<>();
		combinationSum(candidates, target, 0, main, new ArrayList<>());
		return main;
	}

	private static void combinationSum(int[] candidates, int target, int idx, List<List<Integer>> main,
			List<Integer> temp) {
		
		
		if(target==0) {
			main.add(new ArrayList<>(temp));
			return;
		}
		if(target<0) {
			return;
		}
		for(int i=idx;i<candidates.length;i++) {
			temp.add(candidates[i]);
			combinationSum(candidates, target-candidates[i], i, main, temp);
	
			temp.remove(temp.size()-1);
			
			
			
		}
		

	}

}
