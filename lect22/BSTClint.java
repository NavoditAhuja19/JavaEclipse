package lect22;

import java.util.ArrayList;
import java.util.Scanner;

public class BSTClint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
//		BinarySearchTree bst = new BinarySearchTree(arr);
//
//		bst.display();
//		System.out.println(bst.find(70));
//		System.out.println(bst.max());
//		bst.add(8);
//		bst.display();
//		bst.remove(8);
//		// bst.remove(40);
//		bst.display();
//		// bst.add(40);
//		// bst.display();
//		bst.printdecreasing();
//		System.out.println();
//		bst.printinrange(25, 55);
//		System.out.println();
//
//		// bst.replacewithlarger();
//		// bst.display();
//
//		System.out.println(bst.min());
		
		BinarySearchTree bst=new BinarySearchTree();
//		bt.add2(2);
//		bt.add2(1);
//		bt.add2(3);
//	
//		bt.duplicate();
//		bt.display();\
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			bst.add2(scn.nextInt());
		}
		int tar = scn.nextInt();
		int k = scn.nextInt();
		 bst.display();
		bst.printKFar(tar, k);		

	}

}
