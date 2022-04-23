package lect21;

import java.util.ArrayList;

import java.util.Scanner;

public class Binarytreeclint {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		int[] pre=new int[n];
		for(int i=0;i<pre.length;i++) {
			pre[i]=scn.nextInt();
		}
		int[] in=new int[n];
		for(int i=0;i<in.length;i++) {
			in[i]=scn.nextInt();
		}
		BinaryTree bt=new BinaryTree(pre, in);
		//BinaryTree bt = new BinaryTree();
		
//		bt.display();
//		System.out.println(bt.size());
//		System.out.println(bt.find(30));
//		System.out.println(bt.find(100));
//		System.out.println(bt.max());
//		System.out.println(bt.hieght());
//		System.out.println(bt.diameter0());
		// System.out.println(bt.isbalanced());
//		System.out.println(bt.isbalnced2());
		//bt.postorder();
//		// bt.preorderItereatively();
//		bt.inorderItereatively();
	//	System.out.println();
		//bt.inorder();
//		// bt.revpostorder();
//		// bt.postorderItereatively();
		//System.out.println();
		
		//bt.preorder();
		// System.out.println(bt.sum());
		// System.out.println(bt.maxSubTreeSum3());

//		ArrayList<Integer> ar = new ArrayList<>();
//
//		int count = 0;
//		int total = 1;
//		while (count != total) {
//			int num = scn.nextInt();
//			ar.add(num);
//			if (num != -1) {
//				total++;
//			}
//			if (num == -1) {
//				count++;
//			}
//		}
//
//		int[] arr = new int[ar.size()];
//		for (int i = 0; i < ar.size(); i++) {
//			arr[i] = ar.get(i);
//		}
//		System.out.println(ar);
//
		// BinaryTree bt1 = new BinaryTree();
//		 bt.leftview();
		// bt.removeLeaves();
		// bt.display();
		// System.out.println(bt.LCA(60, 50));
		// System.out.println(bt.structurarlysame(bt1));
		//bt.sibling();
//		bt.levelOrderNewLine();

//		System.out.println(bt.sum());
//		bt.display();
//		//bt.rightview();
//	
//		//bt.printleafnodes();
//		int k=scn.nextInt();
//		bt.roottoleaf(k);
		//System.out.println(bt.levelArrayList());
		bt.levelOrderZZ();
	//bt.verticallevelorder();
	bt.largestbst();
	
	
	}

}
//10 true 20 true 40 false true 70 false false true 50 true 60 false false false true 30 false true 80 false false
//10 true 20 true 40 false false true 50  false false true 30 false true 60 false false
//10 true 20 true 40 true 70 true 90 true 110 false false false false false true 50 false true 80 false true 100 false true 120 false false true 30 false true 60 false false
//10 true 20 true 40 true 2 false false true 3 false false true -60 false false true -30 true 50 true 60 true 80 false false false true 70 false false true -100 false false 
//10 true 20 true 40 false false true 50  false false true 30 true 60 false false true 70 false true 80 false false