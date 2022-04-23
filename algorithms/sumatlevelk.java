package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



public class sumatlevelk {
	static  Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		sumatlevelk s = new sumatlevelk();
		GenericTree gt1 = s.new GenericTree();
		int k=scn.nextInt();
		System.out.println(gt1.sumatk(k));

	}

	private class GenericTree {
		private class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
		}

		private Node root;

		public GenericTree() {
			this.root = this.takeInput(scn, null, -1);
		}

		private Node takeInput(Scanner scn, Node parent, int i) {

			int childData = scn.nextInt();

			int numGC = scn.nextInt();

			Node child = new Node();
			child.data = childData;

			for (int j = 0; j < numGC; j++) {
				Node gc = this.takeInput(scn, child, j);
				child.children.add(gc);
			}

			return child;
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
}
