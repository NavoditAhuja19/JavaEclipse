package lect22;




public class BinarySearchTree {

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinarySearchTree(int[] arr) {
		root = construct(arr, 0, arr.length - 1);
	}
	public BinarySearchTree() {
		root=null;
	}

	private Node construct(int[] arr, int lo, int hi) {
		// find root node or mid
		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		// create new node
		Node nn = new Node();
		nn.data = arr[mid];

		// call for left subtree
		nn.left = construct(arr, lo, mid - 1);

		// call for right subtree
		nn.right = construct(arr, mid + 1, hi);

		return nn;
	}

	public void display() {
		System.out.println("------------------------");
		display(root);
		System.out.println("------------------------");
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}
		str += "-->" + node.data + "<--";
		if (node.right == null) {
			str += ".";

		} else {
			str += node.right.data;
		}
		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		return Math.max(lh, rh) + 1;
	}


	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (item > node.data) {
			return find(node.right, item);
		} else if (item < node.data) {
			return find(node.left, item);
		} else {
			return true;
		}

	}

	public void add(int item) {
		add(root, item);
	}

	private void add(Node node, int item) {
		if (node.data < item) {
			if (node.right == null) {
				Node nn = new Node();
				nn.data = item;
				node.right = nn;
			} else {
				add(node.right, item);
			}
		} else {
			if (node.left == null) {
				Node nn = new Node();
				nn.data = item;
				node.left = nn;
			} else {
				add(node.left, item);
			}

		}

	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		} else {
			return max(node.right);
		}

	}

	public void remove(int item) {
		remove(root, null, false, item);
	}

	private void remove(Node node, Node parent, boolean ilc, int item) {
		if (node == null) {
			return;
		}
		if (item < node.data) {
			remove(node.left, node, true, item);

		} else if (item > node.data) {
			remove(node.right, node, false, item);

		} else {
			if (node.left == null && node.right == null) {
				if (ilc) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (node.left == null && node.right != null) {
				if (ilc) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			} else if (node.left != null && node.right == null) {
				if (ilc) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}
			} else {
				int max = max(node.left);
				// update data of node to be removed
				node.data = max;
				remove(node.left, node, true, max);
			}
		}

	}

	// hieght and size same as bt
	// diameter same as bt
	// all three depend on shape or structure
	public void printdecreasing() {
		printdecreasing(root);
	}

	private void printdecreasing(Node node) {
		if (node == null) {
			return;
		}
		printdecreasing(node.right);

		System.out.print(node.data + " ");

		printdecreasing(node.left);

	}

	int sum = 0;

	public void replacewithlarger() {
		replacewithlarger(root);
	}

	private void replacewithlarger(Node node) {
		if (node == null) {
			return;
		}
		replacewithlarger(node.right);
		int temp = node.data;

		node.data = sum;
		sum += temp;

		replacewithlarger(node.left);

	}

	public void printinrange(int lo, int hi) {
		printinrange(root, lo, hi);
	}

	private void printinrange(Node node, int lo, int hi) {
		if (node == null) {
			return;
		}

		if (node.data < lo) {
			printinrange(node.right, lo, hi);
		} else if (node.data > hi) {
			printinrange(node.left, lo, hi);
		} else if (node.data >= lo && node.data <= hi) {
			printinrange(node.left, lo, hi);
			System.out.print(node.data + " ");
			printinrange(node.right, lo, hi);
		}

	}

	public void add2(int item) {
		root = add2(root, item);
	}

	private Node add2(Node node, int item) {
		if (node == null) {
			Node nn = new Node();
			nn.data = item;
			return nn;
		}
		if (item <= node.data) {
			node.left = add2(node.left, item);
		} else {
			node.right = add2(node.right, item);
		}
		return node;

	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		if (node.left == null) {
			return node.data;
		} else {
			return min(node.left);
		}

	}

	public boolean checkbst() {
		return checkbst(root);
	}

	private boolean checkbst(Node node) {
		if (node == null) {
			return true;
		}
		boolean lbst = checkbst(node.left);
		boolean rbst = checkbst(node.right);
		if (lbst && rbst && node.data > max(node.left) && node.data < min(node.right)) {
			return true;
		} else {
			return false;
		}

	}

	public void printKFar(int tar, int k) {
		Nodelevel(this.root, tar, 0);
		boolean left = find(this.root.left, tar);
		int kfar = levelNode - k;
		int kdown = levelNode + k;
		if (this.root.data == tar) {
			this.printatlevel(this.root, 0, kdown);
		} else {
			int h = this.height();
			if (kdown <= h && left) {
				Node temp = this.root.right;
				this.root.right = null;
				this.printatlevel(this.root, 0, kdown);
				this.root.right = temp;
			} else if (kdown <= h && !left) {
				Node temp = this.root.left;
				this.root.left = null;
				this.printatlevel(this.root, 0, kdown);
				this.root.left = temp;
			}
			if (kfar >= 0 && left) {
				Node temp = this.root.right;
				this.root.right = null;
				this.printatlevel(this.root, 0, kfar);
				this.root.right = temp;
			} else if (kfar >= 0 && !left) {
				Node temp = this.root.left;
				this.root.left = null;
				this.printatlevel(this.root, 0, kfar);
				this.root.left = temp;
			}

			if (!left) {
				Node temp = this.root.right;
				this.root.right = null;
				if (this.root.left != null) {
					printatlevel(this.root.left, 0, k - levelNode -1);
				}
				this.root.right = temp;
			} else {
				Node temp = this.root.left;
				this.root.left = null;
				if (this.root.right != null) {
					printatlevel(this.root.right, 0, k - levelNode -1);
				}
				this.root.left = temp;
			}
		}
	}

	int levelNode = 0;

	private void Nodelevel(Node node, int tar, int level) {
		if (node == null) {
			return;
		}
		if (node.data == tar) {
			levelNode = level;
			return;
		}
		Nodelevel(node.left, tar, level + 1);
		Nodelevel(node.right, tar, level + 1);
		return;
	}

	private void printatlevel(Node node, int nl, int pl) {
		// Your Code Goes Here
		if (node == null) {
			return;
		}
		if (nl == pl) {
			System.out.println(node.data);
		}
		printatlevel(node.left, nl + 1, pl);
		printatlevel(node.right, nl + 1, pl);
	}



	public void duplicate() {
		this.duplicate(this.root);
	}

	private void duplicate(Node node) {
		// Your Code Goes Here
		if (node == null) {
			return;
		}
		// create new node
		Node temp=node.left;
		Node nn = new Node();
		nn.data = node.data;
		node.left=nn;
		nn.left=temp;
		duplicate(temp);
		
	
		duplicate(node.right);

	}

}