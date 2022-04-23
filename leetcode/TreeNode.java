package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class BSTIterator {

	public BSTIterator(TreeNode root) {
		list = new ArrayList<>();
		cnt = 0;
		preordertraversal(root, list);
	}

	private void preordertraversal(TreeNode node, List<Integer> list) {
		if (node == null) {
			return;
		}
		preordertraversal(node.left, list);
		list.add(node.val);

		preordertraversal(node.right, list);

	}

	static List<Integer> list;
	static int cnt;

	/** @return the next smallest number */
	public int next() {
		int ans = list.get(cnt);
		cnt++;
		return ans;

	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		if (cnt < list.size()) {
			return true;
		} else {
			return false;
		}
	}

}

class Solution {
	 public int kthSmallest(TreeNode root, int k) {
		 List<Integer> list=new ArrayList<>();
		 preordertraversal(root, list);
		 return list.get(k-1);
	        
	    }
	 private void preordertraversal(TreeNode node, List<Integer> list) {
			if (node == null) {
				return;
			}
			preordertraversal(node.left, list);
			list.add(node.val);

			preordertraversal(node.right, list);

		}
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> main = new ArrayList<>();
		pathSum(root, sum, 0, new ArrayList<>(), main);
		return main;
	}

	private void pathSum(TreeNode node, int sum, int num, List<Integer> temp, List<List<Integer>> main) {

		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			temp.add(node.val);
			num = num + node.val;
			if (sum == num) {
				main.add(new ArrayList<>(temp));
				return;
			} else {
				return;
			}
		}
		temp.add(node.val);
		pathSum(node, sum, num + node.val, temp, main);

		pathSum(node, sum, num + node.val, temp, main);
		temp.remove(temp.size() - 1);

	}

	public boolean hasPathSum(TreeNode root, int sum) {
		return hasPathSum(root, 0, sum);
	}

	private boolean hasPathSum(TreeNode node, int num, int sum) {
		if (node == null) {
			return false;
		}
		if (node.left == null && node.right == null) {
			num = num + node.val;
			if (num == sum) {
				return true;
			} else {
				return false;
			}
		}
		boolean ans = false;
		boolean rr1 = hasPathSum(node.left, num + node.val, sum);
		boolean rr2 = hasPathSum(node.right, num + node.val, sum);
		ans = rr1 || rr2;

		return ans;
	}

	static int sum;

	public int sumNumbers(TreeNode root) {

		sum = 0;
		sumNumbers(root, 0);
		return sum;
	}

	private void sumNumbers(TreeNode node, int num) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			num = num * 10 + node.val;
			sum += num;
			return;
		}
		sumNumbers(node.left, num * 10 + node.val);
		sumNumbers(node.right, num * 10 + node.val);

	}

	public int[] findMode(TreeNode root) {
		HashMap<Integer, Integer> map = new HashMap<>();
		findMode(root, map);
		int max = Integer.MIN_VALUE;
		for (int key : map.keySet()) {
			if (map.get(key) > max) {
				max = key;
			}
		}
		int cnt = 0;
		for (int key : map.keySet()) {
			if (map.get(key) == max) {
				cnt++;
			}

		}
		int[] arr = new int[cnt];
		cnt = 0;
		for (int key : map.keySet()) {
			if (map.get(key) == max) {
				arr[cnt] = key;
			}
		}
		return arr;

	}

	private void findMode(TreeNode node, HashMap<Integer, Integer> map) {

		if (node == null) {
			return;
		}
		int ov = map.getOrDefault(node.val, 0);
		map.put(node.val, ov + 1);
		findMode(node.left, map);
		findMode(node.right, map);

	}

	private class bstpair {
		boolean isvalid;

		long min;
		long max;

	}

	public boolean isValidBST(TreeNode root) {

		return ValidBST(root).isvalid;
	}

	private bstpair ValidBST(TreeNode node) {
		if (node == null) {
			bstpair nn = new bstpair();
			nn.isvalid = true;

			nn.min = (long) Math.pow(10, 11);
			nn.max = -(long) Math.pow(10, 11);
			return nn;
		}
		bstpair lpair = ValidBST(node.left);
		bstpair rpair = ValidBST(node.right);
		bstpair spair = new bstpair();
		spair.isvalid = true;
		if (!lpair.isvalid || !rpair.isvalid || lpair.max > (long) node.val || (long) node.val > rpair.min) {
			spair.isvalid = false;
		}

		spair.min = Math.min((long) node.val, Math.min(lpair.min, rpair.min));
		spair.max = Math.max((long) node.val, Math.max(lpair.max, rpair.max));

		return spair;
	}

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<>();
		inorderTraversal(root, list);
		return list;

	}

	private void inorderTraversal(TreeNode node, List<Integer> list) {
		if (node == null) {
			return;
		}
		inorderTraversal(node.left, list);
		list.add(node.val);

		inorderTraversal(node.right, list);

	}
}
