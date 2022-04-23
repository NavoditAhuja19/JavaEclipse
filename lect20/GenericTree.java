
package lect20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class GenericTree {
	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {
		root = construct(null, -1);

	}

	private Node construct(Node node, int ith) {
		if (node == null) {
			System.out.println("enter data of root node");
		} else {
			System.out.println("enter data of " + ith + " child of " + node.data);
		}
		int item = scn.nextInt();
		// create new node
		Node nn = new Node();
		nn.data = item;
		System.out.println("how many child are there of " + nn.data);
		int noc = scn.nextInt();
		for (int i = 0; i < noc; i++) {
			Node child = construct(nn, i);
			nn.children.add(child);
		}
		return nn;

	}

	public void display() {
		System.out.println("------------------");
		display(root);
		System.out.println("=-----------------");
	}

	private void display(Node node) {
		String str = "";
		str = node.data + "->";
		for (Node child : node.children) {
			str += child.data + " ";
		}
		str += ".";
		System.out.println(str);
		for (Node child : node.children) {
			display(child);
		}
	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {
		int ts = 0;
		for (Node child : node.children) {
			int cs = size(child);
			ts = ts + cs;
		}

		return ts + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		int tm = node.data;
		for (Node child : node.children) {
			int cm = max(child);
			if (cm > tm) {
				tm = cm;
			}

		}

		return tm;
	}

	public int hieght() {
		return hieght(root);
	}

	private int hieght(Node node) {
		int th = -1;
		for (Node child : node.children) {
			int ch = hieght(child);
			if (ch > th) {
				th = ch;
			}

		}

		return th + 1;
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {
		if (item == node.data) {
			return true;
		}
		// boolean tr=false;
		for (Node child : node.children) {
			boolean cr = find(child, item);
			// tr=tr||cr;
			if (cr) {
				return true;
			}

		}
		// return tr;

		return false;

	}

	public void mirror() {

		mirror(root);

	}

	private void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);
		}
//		int i=0;
//		int j=node.children.size()-1;
//		while(i<j) {
//			Node in=node.children.get(i);
//			Node jn=node.children.get(j);
//			node.children.set(i, jn);
//			node.children.set(j, in);
//			i++;
//			j--;
//		}
		Collections.reverse(node.children);

	}

	public void linearly() {

		linearly(root);

	}

	private void linearly(Node node) {
		for (Node child : node.children) {
			linearly(child);
		}
		while (node.children.size() > 1) {
			Node temp = node.children.remove(1);
			Node tail = gettail(node.children.get(0));
			tail.children.add(temp);
		}

	}

	private Node gettail(Node node) {
		if (node.children.size() == 0) {
			return node;
		}

		return gettail(node.children.get(0));
	}

	public void printatlevel(int level) {
		printatlevel(root, level, 0);
	}

	private void printatlevel(Node node, int level, int count) {
		if (count == level) {
			System.out.println(node.data);
			return;
		}
		for (Node child : node.children) {
			printatlevel(child, level, count + 1);

		}

	}

	public void levelorder() {
		LinkedList<Node> queue = new LinkedList<>();
		// add root node
		queue.addLast(root);
		while (!queue.isEmpty()) {
			// remove node
			Node rn = queue.removeFirst();
			// print removed node
			System.out.print(rn.data + " ");
			// add children of removed node
			for (Node child : rn.children) {
				queue.addLast(child);
			}
		}
	}

	public void levelorderlinewise() {
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
				// add children of removed node
				for (Node child : rn.children) {
					queue.addLast(child);
				}
			}
		}
	}

	public void levelorderlinewise2() {
		LinkedList<Node> primary = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();
		// add root node
		primary.addLast(root);

		while (!primary.isEmpty()) {
			// remove node
			Node rn = primary.removeFirst();

			// print removed node
			System.out.print(rn.data + " ");
			// add children of removed node
			for (Node child : rn.children) {
				helper.addLast(child);
			}
			if (primary.isEmpty()) {
				System.out.println();
				primary = helper;
				helper = new LinkedList<>();
			}

		}
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {
		System.out.print(node.data + " ");
		for (Node child : node.children) {
			preorder(child);
		}

	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {

		for (Node child : node.children) {
			postorder(child);
		}
		System.out.print(node.data + " ");

	}

	public boolean structurarlysame(GenericTree other) {
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
//		if(node1.children.size()!=node2.children.size()) {
//			return false;
//		}
		boolean ft=true;;
		for(int i=0;i<node1.children.size();i++) {
			boolean ct=structurarlysame(node1.children.get(i),node2.children.get(i));
			ft=ft&&ct;
		}

		return ft;

	}
	public int countLeafNodes() {
		return countLeafNodes(this.root);
	}

	private int countLeafNodes(Node node) {
		if(node.children.size()==0) {
			return 1;
		}
		int count=0;
		for (Node child : node.children) {
			 count+=countLeafNodes(child);
		}
		return count;

	}
	public int sumOfNodes() {
		return this.sumOfNodes(this.root);
	}

	private int sumOfNodes(Node node) {
		int sum=0;
		sum+=node.data;
		
		
		for (Node child : node.children) {
			 sum+=sumOfNodes(child);
		}
		
	return sum;
	}
	public void replaceWithDepth() {
		this.replaceWithDepth(this.root, 0);
	}

	private void replaceWithDepth(Node node, int d) {

		// write your code here
		node.data=d;
		for(Node child :node.children  ) {
			replaceWithDepth(child, d+1);
		}

	}
	

	public int sumatk(int k) {

		LinkedList<Node> queue = new LinkedList<>();
		// add root node
		queue.addLast(root);
		queue.addLast(null);
		int sum=0;
		int cnt=0;
		while (!queue.isEmpty()) {
			// remove node
			Node rn = queue.removeFirst();
			if (rn == null) {
				if(cnt==k) {
					return sum;
				}
				cnt++;
				sum=0;
				//System.out.println();
				if (queue.isEmpty()) {
					return sum;
				} else {
					queue.addLast(null);
				}
			} else {
				// print removed node
				//System.out.print(rn.data + " ");
				sum+=rn.data;
				
				// add children of removed node
				for (Node child : rn.children) {
					queue.addLast(child);
				}
			}
		}

		return sum;

	}

}
