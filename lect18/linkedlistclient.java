package lect18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedlistclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		linkedlist list = new linkedlist();
//		list.addlast(10);
//		list.addlast(20);
//		list.addlast(30);
//		list.addlast(40);
//		list.display();
//		list.addat(2, 60);
//		list.display();
//		System.out.println(list.removefirst());
//		list.display();
//		System.out.println(list.removelast());
//
//		list.display();
//		System.out.println(list.removeat(1));
//		list.display();
//		list.addlast(40);
//		list.addlast(50);
//		list.addlast(60);
//		list.addfirst(10);
//		list.display();
//		System.out.println(list.getat(2));
//		list.reversedataiteratively();
//		list.display();
//		list.reversepointerrecursiverly();
//		list.display();
//		list.reversepointeriteratively();
//		list.display();
//		list.reversedatarecursively();
//		list.display();
//		// list.fold();
//		// list.display();
//		System.out.println(list.kthnodefromn(4));
//		list.removelast();
//		list.removelast();
//		list.removelast();
//		list.addlast(20);
//		list.addlast(10);
//		list.display();
//		System.out.println(list.palindrome());
//		list.removeat(2);
//		list.display();
//		System.out.println(list.palindrome());
//		list.removeat(2);
//		list.addat(2, 10);
//		list.addat(2, 10);
//		list.display();
//		System.out.println(list.palindrome());
//		list.removelast();
//		list.removelast();
//		list.removelast();
//		list.addlast(30);
//		list.addlast(40);
//		list.addlast(50);
//		list.addlast(60);
//		list.addlast(70);
//		list.addlast(80);
//		list.display();
//		list.kreverse(3);
//		list.display();
//		list.createdummylistloop();
//		

//		int N = scn.nextInt();
//		//int M = scn.nextInt();
//
//		
//		linkedlist list = new linkedlist();
//
//		for (int i = 0; i < N; i++) {
//			list.addlast(scn.nextInt());
//		}
//		int n= scn.nextInt();
//		list.appendLastN(n);
//		list.display();

//		int a = 0;
//
//		while (a != -1) {
//			a = scn.nextInt();
//			if (a != -1) {
//				list.addlast(a);
//			}
//
//		}
//		int k=scn.nextInt();
//
//		System.out.println(list.kthnodefromn(k));
// sum of 2 linked list
//	linkedlist list1=new linkedlist();
//	linkedlist list2=new linkedlist();
//		int n = scn.nextInt();
//		int m = scn.nextInt();
//		
//		for (int i = 0; i < n; i++) {
//			int a = scn.nextInt();
//			list1.addlast(a);
//	
//		}
//		for (int i = 0; i < m; i++) {
//			int b = scn.nextInt();
//			list2.addlast(b);
//			
//		}
//
//		linkedlist sumlist=list1.sumoftwoll(list2);
//		sumlist.display1();
//		Scanner scn = new Scanner(System.in);
//		linkedlist list1=new linkedlist();
//		linkedlist list2=new linkedlist();
//		linkedlist list3=new linkedlist();
//			int n = scn.nextInt();
//			int m = scn.nextInt();
//			int k = scn.nextInt();
//			
//			for (int i = 0; i < n; i++) {
//				int a = scn.nextInt();
//				list1.addlast(a);
//		
//			}
//			for (int i = 0; i < m; i++) {
//				int b = scn.nextInt();
//				list2.addlast(b);
//				
//			}
//			for (int i = 0; i < k; i++) {
//				int b = scn.nextInt();
//				list3.addlast(b);
//				
//			}
//			int tar=scn.nextInt();
//			linkedlist triplet=list1.tripledlist(list2, list3, tar);
//			triplet.display1(); 
//			Scanner scn = new Scanner(System.in);
//			linkedlist list1=new linkedlist();
//			int n = scn.nextInt();
//			for (int i = 0; i < n; i++) {
//				int a = scn.nextInt();
//				list1.addlast(a);
//		
//			}
//			list1.lloddeven();
//			list1.display1();
			Scanner scn = new Scanner(System.in);
			Linkedlist list1=new Linkedlist();
			Linkedlist list2=new Linkedlist();
			int n = scn.nextInt();
			for (int i = 0; i < n; i++) {
				int a = scn.nextInt();
				list1.addlast(a);
		
			}
			int m = scn.nextInt();
			for (int i = 0; i < m; i++) {
				int a = scn.nextInt();
				list2.addlast(a);
		
			}
			list1.merge_sorted_list(list2);

	}

}
