package lect21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;



public class BinaryTree {
	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

//	public BinaryTree() {
//		root = takeinput(null, false);
//	}
	public BinaryTree() {
		root = construct(null);
	}

	private Node construct(Node node) {
		LinkedList<Node> queue = new LinkedList<>();
		int x = scn.nextInt();
		// create new node
		Node nn = new Node();
		nn.data = x;
		queue.addLast(nn);
		while (!queue.isEmpty()) {
			Node temp = queue.removeFirst();
			int l = scn.nextInt();
			int r = scn.nextInt();
			if (l != -1) {
				Node n = new Node();
				n.data = l;
				temp.left = n;
				queue.addLast(n);
			} else {
				temp.left = null;
			}
			if (r != -1) {
				Node n = new Node();
				n.data = r;
				temp.right = n;
				queue.addLast(n);
			} else {
				temp.right = null;
			}

		}

		return nn;
	}

	public BinaryTree(int[] pre, int[] in) {
		root = takeinput(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}
//	public BinaryTree(int[] post, int[] in) {
//		root = construct(post, 0, post.length - 1, in, 0, in.length - 1);
//	}

	private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {

		if (plo > phi || ilo > ihi) {
			return null;
		}
		// create new node
		Node nn = new Node();
		nn.data = post[phi];
		// find phi in inorder and index of that element
		int si = -1;
		int cnt = 0;
		for (int i = ilo; i <= ihi; i++) {

			if (in[i] == phi) {

				si = i;
				break;
			}
			cnt++;

		}

		// call left child
		nn.left = construct(post, plo, plo + cnt - 1, in, ilo, si - 1);
		// call right child
		nn.right = construct(post, plo + cnt, phi - 1, in, si + 1, ihi);

		return nn;
	}

	private Node takeinput(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (plo > phi || ilo > ihi) {
			return null;
		}
		// create new node
		Node nn = new Node();
		nn.data = pre[plo];
		// count index of plo in inorder
		int nel = 0;
		int si = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == pre[plo]) {
				si = i;
				break;
			}
			nel++;
		}
		// call for left child
		nn.left = takeinput(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = takeinput(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return nn;
	}

	private Node takeinput(Node parent, boolean ilc) {
		// enter data of the node you have entered
		if (parent == null) {
			System.out.println("enter data of root node ?");
		} else {
			if (ilc) {
				System.out.println("enter data for left child of " + parent.data);

			} else {
				System.out.println("enter data for right child of " + parent.data);
			}
		}
		int item = scn.nextInt();
		// create new node
		Node nn = new Node();
		nn.data = item;
		// ask does node have left child
		System.out.println(nn.data + " has left child ?");
		// take input for the same
		boolean hlc = scn.nextBoolean();
		// if yes take input for left child
		if (hlc) {
			nn.left = takeinput(nn, true);
		}
		// ask does node have left child
		System.out.println(nn.data + " has right child ?");
		// take input for the same
		boolean hrc = scn.nextBoolean();
		// if yes take input for right child
		if (hrc) {
			nn.right = takeinput(nn, false);
		}

		return nn;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		// self work
		String str = "";
		if (node.left == null) {
			str += ".";
		} else
			str += node.left.data;

		str += "-->" + node.data + "<--";

		if (node.right == null) {
			str += ".";
		} else
			str += node.right.data;

		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}
		int l = size(node.left);
		int r = size(node.right);
		return l + r + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		if (node == null) {
			return Integer.MIN_VALUE;
		}
		// int max = node.data;
		int lm = max(node.left);
//		if (lm > max) {
//			max = lm;
//		}
		int rm = max(node.right);
//		if (rm > max) {
//			max = rm;
//		}

		return Math.max(node.data, Math.max(lm, rm));
		// return max;
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);
		return lf || rf;

	}

	public int hieght() {
		return hieght(root);
	}

	private int hieght(Node node) {
		if (node == null) {
			return -1;
		}

		int lh = hieght(node.left);
		int rh = hieght(node.right);
		return Math.max(lh, rh) + 1;

	}

	int diameterans;

	public int diameter() {
		diameter(root);
		return diameterans;
	}

	private void diameter(Node node) {
		if (node == null) {
			return;
		}

		int presentnodediameter = hieght(node.left) + hieght(node.right) + 2;
		if (presentnodediameter > diameterans) {
			diameterans = presentnodediameter;
		}
		diameter(node.left);
		diameter(node.right);

	}

	int diameterans1;

	public int diameter0() {
		diameter0(root);
		return diameterans1;
	}

	private int diameter0(Node node) {
		if (node == null) {
			return -1;
		}
		int lht = diameter0(node.left);
		int rht = diameter0(node.right);

		int presentnodediameter = lht + rht + 2;
		if (presentnodediameter > diameterans1) {
			diameterans1 = presentnodediameter;
		}
		return Math.max(lht, rht) + 1;

	}

	public int diameter2() {
		return diameter2(root);
	}

	private int diameter2(Node node) {
		if (node == null) {
			return 0;
		}
		int ld = diameter2(node.left);
		int rd = diameter2(node.right);
		int sd = hieght(node.left) + hieght(node.right) + 2;

		return Math.max(sd, Math.max(rd, ld));

	}

	private class diapair {
		int ht = -1;
		int dia = 0;
	}

	public int diameter3() {
		return diameter3(root).dia;
	}

	private diapair diameter3(Node node) {
		if (node == null) {
			return new diapair();
		}
		diapair ldp = diameter3(node.left);
		diapair rdp = diameter3(node.right);
		diapair sdp = new diapair();
		int ld = ldp.dia;
		int rd = rdp.dia;
		int sd = ldp.ht + rdp.ht + 2;
		sdp.dia = Math.max(sd, Math.max(ld, rd));
		sdp.ht = Math.max(ld, rd) + 1;
		return sdp;

	}

	public boolean isbalanced() {
		return isbalnced(root);
	}

	private boolean isbalnced(Node node) {
		if (node == null) {
			return true;
		}
		boolean lb = isbalnced(node.left);
		boolean rb = isbalnced(node.right);
		int sb = hieght(node.left) - hieght(node.right);
		if (lb == rb == true && sb >= -1 && sb <= 1) {
			return true;
		} else
			return false;

	}

	private class balpair {
		int ht = -1;
		boolean bf = true;
	}

	public boolean isbalnced2() {
		return isbalanced2(root).bf;
	}

	private balpair isbalanced2(Node node) {
		if (node == null) {
			return new balpair();
		}
		balpair lbp = isbalanced2(node.left);
		balpair rbp = isbalanced2(node.right);
		balpair sbp = new balpair();
		boolean lb = lbp.bf;
		boolean rb = rbp.bf;
		int sb = lbp.ht - rbp.ht;
		if (lb == rb == true && sb >= -1 && sb <= 1) {
			sbp.bf = true;
		} else
			sbp.bf = false;
		sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
		return sbp;

	}

	public boolean flipquivalent(BinaryTree other) {
		return flipquivalent(root, other.root);

	}

	private boolean flipquivalent(Node node1, Node node2) {

		if (node1 == null && node2 == null) {
			return true;
		}
		if (node1 == null || node2 == null) {
			return false;
		}
		if (node1.data != node2.data) {
			return false;
		}
		boolean ll = flipquivalent(node1.left, node2.left);
		boolean rr = flipquivalent(node1.right, node2.right);
		if (ll && rr) {
			return true;
		}
		boolean lr = flipquivalent(node1.left, node2.right);
		boolean rl = flipquivalent(node1.right, node2.left);

		if (lr && rl) {
			return true;
		}
		return false;
	}

	public void preorder() {
		preorder(root);
	}
// nlr

	private void preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");

		preorder(node.left);

		preorder(node.right);

	}

	public void postorder() {
		postorder(root);
	}

//lrn
	private void postorder(Node node) {
		if (node == null) {
			return;
		}

		postorder(node.left);

		postorder(node.right);

		System.out.print(node.data + " ");

	}

	public void inorder() {
		inorder(root);
	}

//lnr
	private void inorder(Node node) {
		if (node == null) {
			return;
		}

		inorder(node.left);

		System.out.print(node.data + " ");

		inorder(node.right);

	}

	// rnl=reverse inorder

	// nrl=reverse postorder
	public void revpostorder() {
		revpostorder(root);
	}

	private void revpostorder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");

		revpostorder(node.right);

		revpostorder(node.left);

	}

	// rln=reverse preorder
	public class Pair {
		Node node;
		boolean sd;
		boolean ld;
		boolean rd;

	}

	public void preorderItereatively() {
		Stack<Pair> stack = new Stack<>();
		// create new pair for root node
		Pair rp = new Pair();
		rp.node = root;
		stack.push(rp);
		while (!stack.isEmpty()) {
			Pair tp = stack.peek();
			if (tp.node == null) {
				stack.pop();
				continue;
			}
			if (tp.sd == false) {
				System.out.print(tp.node.data + " ");
				tp.sd = true;
			} else if (tp.ld == false) {
				Pair np = new Pair();
				np.node = tp.node.left;
				stack.push(np);
				tp.ld = true;

			} else if (tp.rd == false) {
				Pair np = new Pair();
				np.node = tp.node.right;
				stack.push(np);
				tp.rd = true;

			} else {
				stack.pop();
			}

		}

	}

	public void postorderItereatively() {
		Stack<Pair> stack = new Stack<>();
		// create new pair for root node
		Pair rp = new Pair();
		rp.node = root;
		stack.push(rp);
		while (!stack.isEmpty()) {
			Pair tp = stack.peek();
			if (tp.node == null) {
				stack.pop();
				continue;
			}
			if (tp.ld == false) {
				Pair np = new Pair();
				np.node = tp.node.left;
				stack.push(np);
				tp.ld = true;

			} else if (tp.rd == false) {
				Pair np = new Pair();
				np.node = tp.node.right;
				stack.push(np);
				tp.rd = true;

			} else if (tp.sd == false) {
				System.out.print(tp.node.data + " ");
				tp.sd = true;
			} else {
				stack.pop();
			}

		}

	}

	public void inorderItereatively() {
		Stack<Pair> stack = new Stack<>();
		// create new pair for root node
		Pair rp = new Pair();
		rp.node = root;
		stack.push(rp);
		while (!stack.isEmpty()) {
			Pair tp = stack.peek();
			if (tp.node == null) {
				stack.pop();
				continue;
			}
			if (tp.ld == false) {
				Pair np = new Pair();
				np.node = tp.node.left;
				stack.push(np);
				tp.ld = true;

			} else if (tp.sd == false) {
				System.out.print(tp.node.data + " ");
				tp.sd = true;
			} else if (tp.rd == false) {
				Pair np = new Pair();
				np.node = tp.node.right;
				stack.push(np);
				tp.rd = true;

			} else {
				stack.pop();
			}

		}

	}

	public int sum() {
		return sum(root);
	}

	private int sum(Node node) {
		if (node == null) {
			return 0;
		}

		int ls = sum(node.left);
		int rs = sum(node.right);
		return node.data + ls + rs;

	}

	public int maxsum = Integer.MIN_VALUE;

	public int maxSubTreeSum1() {
		maxSubTreeSum1(root);
		return maxsum;

	}

	private int maxSubTreeSum1(Node node) {
		if (node == null) {
			return 0;
		}
		int ls = maxSubTreeSum1(node.left);
		int rs = maxSubTreeSum1(node.right);
		int presentsubtreesum = ls + rs + node.data;
		if (presentsubtreesum > maxsum) {
			maxsum = presentsubtreesum;
		}
		return presentsubtreesum;

	}

	public int maxSubTreeSum2() {
		return maxSubTreeSum2(root);

	}

	private int maxSubTreeSum2(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lsm = maxSubTreeSum2(node.left);
		int rsm = maxSubTreeSum2(node.right);
		int selfsum = sum(node.left) + sum(node.right) + node.data;
		return Math.max(selfsum, Math.max(lsm, rsm));

	}

	private class maxpair {
		int entiresum = 0;
		int maxsubsum = Integer.MIN_VALUE;;

	}

	public int maxSubTreeSum3() {
		return maxSubTreeSum3(root).maxsubsum;
	}

	private maxpair maxSubTreeSum3(Node node) {
		if (node == null) {
			return new maxpair();
		}
		maxpair lmp = maxSubTreeSum3(node.left);
		maxpair rmp = maxSubTreeSum3(node.right);
		maxpair smp = new maxpair();
		int leftsubtreemax = lmp.maxsubsum;
		int rightsubtreemax = rmp.maxsubsum;

		int selfsum = lmp.entiresum + rmp.entiresum + node.data;
		smp.maxsubsum = Math.max(selfsum, Math.max(leftsubtreemax, rightsubtreemax));
		smp.entiresum = selfsum;
		return smp;
	}

	private class bstpair {
		boolean isbst = true;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int largestbstsize = 0;
		int largestbstnode = 0;
	}

	public boolean checkbst2() {
		return checkbst2(root).isbst;
	}

	private bstpair checkbst2(Node node) {
		if (node == null) {
			return new bstpair();
		}
		bstpair lbp = checkbst2(node.left);
		bstpair rbp = checkbst2(node.right);
		bstpair sbp = new bstpair();
		sbp.max = Math.max(node.data, Math.max(lbp.max, rbp.max));
		sbp.min = Math.min(node.data, Math.min(lbp.min, rbp.min));
		if (lbp.isbst && rbp.isbst && node.data > lbp.max && node.data < rbp.min) {
			sbp.isbst = true;
		} else {
			sbp.isbst = false;
		}

		return sbp;

	}

	public void largestbst() {
		bstpair ans = largestbst(root);

		System.out.println(ans.largestbstsize);
		//System.out.println(ans.largestbstnode + " it size is" + ans.largestbstsize);
	}

	private bstpair largestbst(Node node) {
		if (node == null) {
			return new bstpair();
		}
		bstpair lbp = largestbst(node.left);
		bstpair rbp = largestbst(node.right);
		bstpair sbp = new bstpair();
		sbp.max = Math.max(node.data, Math.max(lbp.max, rbp.max));
		sbp.min = Math.min(node.data, Math.min(lbp.min, rbp.min));
		if (lbp.isbst && rbp.isbst && node.data > lbp.max && node.data < rbp.min) {
			sbp.isbst = true;
			sbp.largestbstnode = node.data;
			sbp.largestbstsize = lbp.largestbstsize + rbp.largestbstsize + 1;

		} else {
			sbp.isbst = false;
			if (rbp.largestbstsize < lbp.largestbstsize) {
				sbp.largestbstsize = lbp.largestbstsize;
				sbp.largestbstnode = lbp.largestbstnode;
			} else {
				sbp.largestbstsize = rbp.largestbstsize;
				sbp.largestbstnode = rbp.largestbstnode;
			}
		}

		return sbp;

	}

	public void leftview() {

		LinkedList<Node> queue = new LinkedList<>();
		// add root node
		queue.addLast(root);
		queue.addLast(null);
		Node lrn = null;
		while (!queue.isEmpty()) {
			// remove node
			Node rn = queue.removeFirst();
			if (rn == null) {
				// System.out.println();
				if (queue.isEmpty()) {
					return;
				} else {
					queue.addLast(null);
				}
			} else {
				// print removed node
				if (lrn == null)
					System.out.print(rn.data + " ");
				if (rn.left != null) {
					queue.addLast(rn.left);
				}
				if (rn.right != null) {
					queue.addLast(rn.right);
				}
			}
			lrn = rn;
		}

	}

	public void rightview() {

		LinkedList<Node> queue = new LinkedList<>();
		// add root node
		queue.addLast(root);
		queue.addLast(null);

		while (!queue.isEmpty()) {
			// remove node
			Node rn = queue.removeFirst();

			if (rn == null) {
				// System.out.println();
				if (queue.isEmpty()) {
					return;
				} else {
					queue.addLast(null);
				}
			} else {
				Node nextnode = queue.removeFirst();
				queue.addFirst(nextnode);
				// print removed node
				if (nextnode == null)
					System.out.print(rn.data + " ");
				if (rn.left != null) {
					queue.addLast(rn.left);
				}
				if (rn.right != null) {
					queue.addLast(rn.right);
				}
			}

		}

	}

	public void levelOrderZZ() {

		ArrayList<ArrayList<Integer>> main = this.levelArrayList();
		int mainsize = main.size();
		for (int i = 0; i < mainsize; i++) {
			ArrayList<Integer> disp = new ArrayList<>();
			disp = main.remove(0);
			if (i % 2 == 0) {
				for (int j = 0; j < disp.size(); j++) {
					System.out.print(disp.get(j) + " ");
				}
			} else {
				for (int j = disp.size() - 1; j >= 0; j--) {
					System.out.print(disp.get(j) + " ");
				}

			}

		}
	}

	public ArrayList<ArrayList<Integer>> levelArrayList() {

		ArrayList<ArrayList<Integer>> main = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		LinkedList<Node> queue = new LinkedList<>();
		// add root node
		queue.addLast(root);
		queue.addLast(null);
		while (!queue.isEmpty()) {
			// remove node
			Node rn = queue.removeFirst();

			if (rn == null) {
				main.add(new ArrayList<>(temp));

				while (!temp.isEmpty()) {
					temp.remove(temp.size() - 1);
				}
				if (queue.isEmpty()) {
					return main;
				} else {
					queue.addLast(null);
				}
			} else {

				// print removed node

				temp.add(rn.data);
				// System.out.print(rn.data + " ");
				if (rn.left != null) {
					queue.addLast(rn.left);
				}
				if (rn.right != null) {
					queue.addLast(rn.right);
				}
			}

		}

		return main;
	}

	public int LCA(int value1, int value2) {
		return LCA(root, value1, value2).data;
	}

	private Node LCA(Node node, int value1, int value2) {
		boolean lv1 = find(node.left, value1);
		boolean rv2 = find(node.right, value2);
		boolean lv2 = find(node.left, value2);
		boolean rv1 = find(node.right, value1);
		boolean nv1 = false;
		boolean nv2 = false;
		if (node.data == value1) {
			nv1 = true;
		}
		if (node.data == value2) {
			nv2 = true;
		}
		if (lv1 && rv2 || lv2 && rv1 || nv1 && lv2 || nv1 && rv2 || nv2 && lv1 || nv2 && rv1) {
			return node;
		} else if (lv1 && lv2) {
			return LCA(node.left, value1, value2);
		} else if (rv1 && rv2) {
			return LCA(node.right, value1, value2);
		} else {
			return null;
		}

	}

	public boolean structurarlysame(BinaryTree other) {
		return structurarlysame(this.root, other.root);
	}

	private boolean structurarlysame(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return true;
		}

		if (node1 == null || node2 == null) {
			return false;
		}

		if (node1.data != node2.data) {
			return false;
		}

		boolean ct = true;
		boolean lt = structurarlysame(node1.left, node2.left);
		boolean rt = structurarlysame(node1.right, node2.right);
		ct = ct && lt && rt;

		return ct;

	}

	public void removeLeaves() {
		this.removeLeaves(null, this.root, false);
	}

	private void removeLeaves(Node parent, Node child, boolean ilc) {

		// write your code here
		if (child == null) {
			return;
		}
		if (parent == null && child.left == null && child.right == null) {
			root = null;

		}
		if (child.left == null && child.right == null) {
			if (ilc) {

				parent.left = null;
				return;

			} else {
				parent.right = null;
				return;

			}

		}
		removeLeaves(child, child.left, true);
		removeLeaves(child, child.right, false);

	}

	public void sibling() {
		this.sibling(this.root);
	}

	private void sibling(Node node) {
		// write your code here
		if (node == null) {
			return;
		}
		if (node.left != null && node.right == null) {
			System.out.print(node.left.data + " ");
		}
		if (node.left == null && node.right != null) {
			System.out.print(node.right.data + " ");
		}
		sibling(node.left);
		sibling(node.right);

	}

	public void levelOrderNewLine() {

		// write your code here

		LinkedList<Node> queue = new LinkedList<>();
		// add root node
		queue.addLast(root);
		queue.addLast(null);
		while (!queue.isEmpty()) {
			// remove node
			Node rn = queue.removeFirst();
			if (rn == null) {
				System.out.println();
				if (queue.isEmpty()) {
					return;
				} else {
					queue.addLast(null);
				}
			} else {
				// print removed node
				System.out.print(rn.data + " ");
				if (rn.left != null) {
					queue.addLast(rn.left);
				}
				if (rn.right != null) {
					queue.addLast(rn.right);
				}
			}
		}

	}

	public void printleafnodes() {
		printleafnodes(root);
	}

	private void printleafnodes(Node node) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			System.out.print(node.data + " ");
		}
		printleafnodes(node.left);
		printleafnodes(node.right);
	}

	public void roottoleaf(int k) {
		roottoleaf(root, 0, "", k);
	}

	private void roottoleaf(Node node, int sum, String ans, int k) {
		if (node == null) {
			return;
		}
		if (sum + node.data == k && node.left == null && node.right == null) {
			System.out.println(ans + " " + node.data);
			return;
		}
		roottoleaf(node.left, sum + node.data, ans + " " + node.data, k);
		roottoleaf(node.right, sum + node.data, ans + " " + node.data, k);

	}

	private class vopair {
		Node node;
		int vlindex;
	}

	public void verticallevelorder() {

		HashMap<Integer, ArrayList<Integer>> hash = new HashMap<>();
		Queue<vopair> queue = new LinkedList<>();
		vopair vp = new vopair();
		vp.node = root;
		vp.vlindex = 0;
		queue.add(vp);
		while (!queue.isEmpty()) {
			vopair rp = queue.remove();
			if (hash.containsKey(rp.vlindex)) {

				hash.get(rp.vlindex).add(rp.node.data);

			} else {
				hash.put(rp.vlindex, new ArrayList<>());
				hash.get(rp.vlindex).add(rp.node.data);
			}
			if(rp.node.left!=null) {
				vopair np=new vopair();
				np.node=rp.node.left;
				np.vlindex=rp.vlindex-1;
				queue.add(np);
			}
			if(rp.node.right!=null) {
				vopair np=new vopair();
				np.node=rp.node.right;
				np.vlindex=rp.vlindex+1;
				queue.add(np);
			}

		}
		ArrayList<Integer> vlindexlist=new ArrayList<>(hash.keySet());
		//System.out.println(hash);
		Collections.sort(vlindexlist);
		
		for(int key:vlindexlist) {
			ArrayList<Integer> list=hash.get(key);
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
		}

	}
	public void topview() {

		HashMap<Integer, ArrayList<Integer>> hash = new HashMap<>();
		Queue<vopair> queue = new LinkedList<>();
		vopair vp = new vopair();
		vp.node = root;
		vp.vlindex = 0;
		queue.add(vp);
		while (!queue.isEmpty()) {
			vopair rp = queue.remove();
			if (hash.containsKey(rp.vlindex)) {

				hash.get(rp.vlindex).add(rp.node.data);

			} else {
				hash.put(rp.vlindex, new ArrayList<>());
				hash.get(rp.vlindex).add(rp.node.data);
			}
			if(rp.node.left!=null) {
				vopair np=new vopair();
				np.node=rp.node.left;
				np.vlindex=rp.vlindex-1;
				queue.add(np);
			}
			if(rp.node.right!=null) {
				vopair np=new vopair();
				np.node=rp.node.right;
				np.vlindex=rp.vlindex+1;
				queue.add(np);
			}

		}
		ArrayList<Integer> vlindexlist=new ArrayList<>(hash.keySet());
		//System.out.println(hash);
		Collections.sort(vlindexlist);
		
		for(int key:vlindexlist) {
			ArrayList<Integer> list=hash.get(key);
			
				System.out.print(list.get(0)+" ");
			
			System.out.println();
		}

	}
	public void bottomview() {

		HashMap<Integer, ArrayList<Integer>> hash = new HashMap<>();
		Queue<vopair> queue = new LinkedList<>();
		vopair vp = new vopair();
		vp.node = root;
		vp.vlindex = 0;
		queue.add(vp);
		while (!queue.isEmpty()) {
			vopair rp = queue.remove();
			if (hash.containsKey(rp.vlindex)) {

				hash.get(rp.vlindex).add(rp.node.data);

			} else {
				hash.put(rp.vlindex, new ArrayList<>());
				hash.get(rp.vlindex).add(rp.node.data);
			}
			if(rp.node.left!=null) {
				vopair np=new vopair();
				np.node=rp.node.left;
				np.vlindex=rp.vlindex-1;
				queue.add(np);
			}
			if(rp.node.right!=null) {
				vopair np=new vopair();
				np.node=rp.node.right;
				np.vlindex=rp.vlindex+1;
				queue.add(np);
			}

		}
		ArrayList<Integer> vlindexlist=new ArrayList<>(hash.keySet());
		//System.out.println(hash);
		Collections.sort(vlindexlist);
		
		for(int key:vlindexlist) {
			ArrayList<Integer> list=hash.get(key);
			
				System.out.print(list.get(list.size()-1)+" ");
			
			//System.out.println();
		}

	}
}// 10 true 20 true 40 true 70 true 90 true 110 false false false false false
	// true 50 false true 80 false true 100 false true 120 false false true 30 false
	// true 60 false false
//private boolean flipEquivalent(Node node1,Node node2) {

//Base Case
//if(node1==null) {
//	if(node2==null)
//		return true;
//	
//	else
//		return false;
//
//}
//
//
//if(node1.left.data==node2.left.data) {
//
//	if(node1.right.data==node2.right.data)
//	{
//		boolean b1=flipEquivalent(node1.left, node2.left);
//		boolean b2=flipEquivalent(node1.right, node2.right);
//		return b1 && b2;
//		
//	}
//		
//	else 
//		return false;
//
//
//}
//
//
//else if(node1.left.data==node2.right.data) {
//	
//	if(node1.right.data==node1.left.data)
//	{
//		
//		Node temp=node1.left;
//		node1.left=node1.right;
//		node1.right=temp;
//		
//		boolean b1=flipEquivalent(node1.left, node2.left);
//		boolean b2=flipEquivalent(node1.right, node2.right);
//		return b1 && b2;
//	
//	}
//	
//	else
//		return false;
//
//
//}
//
//return false;
//
//
//
//
//}
