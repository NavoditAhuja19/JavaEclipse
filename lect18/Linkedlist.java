package lect18;

import java.util.LinkedList;

public class Linkedlist {
	private class Node {
		int data;
		Node next;

		public Node() {

		}

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() throws Exception {

		if (size == 0) {
			throw new Exception("ll is empty");
		}
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}

		System.out.println("\n" + "------------");
	}

	public void display1() throws Exception {

		if (size == 0) {
			throw new Exception("ll is empty");
		}
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	public void addlast(int item) {
		// create new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		// attach
		if (this.size >= 1) {
			this.tail.next = nn;
		}

		// update
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}

	}

	public void addfirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		// attach
		if (this.size >= 1) {
			nn.next = this.head;

		}
		// update
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			this.head = nn;
			this.size++;
		}

	}

	public int getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		return this.head.data;
	}

	public int getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		return this.tail.data;
	}

	public int getat(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("index unavailable");
		}

		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getNodeat(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("index unavailable");
		}

		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addat(int idx, int item) throws Exception {
		if (idx < 0 || idx > size) {
			throw new Exception("Invalid index");
		}
		if (idx == 0) {
			addfirst(item);
		} else if (idx == this.size) {
			addlast(item);
		} else {

			// create new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			// attach
			Node nm1 = getNodeat(idx - 1);
			Node np1 = nm1.next;
			nm1.next = nn;
			nn.next = np1;
			// summary
			this.size++;
		}
	}

	public int removefirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		int rv = head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}

		return rv;
	}

	public int removelast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		int rv = tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sizem2 = getNodeat(size - 2);
			this.tail = sizem2;
			this.tail.next = null;
			this.size--;
		}

		return rv;
	}

	public int removeat(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid index");

		}
		if (idx == 0) {
			return removefirst();
		} else if (idx == this.size - 1) {
			return removelast();
		} else {
			Node nm1 = getNodeat(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			this.size--;
			return n.data;

		}

	}

	public void reversedataiteratively() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node ln = getNodeat(left);
			Node rn = getNodeat(right);
			int t = ln.data;
			ln.data = rn.data;
			rn.data = t;
			left++;
			right--;
		}

	}

	public void reversepointeriteratively() {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		// swap head to tail
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		//
		this.tail.next = null;
	}

	public void reversepointerrecursiverly() {
		reversepointerrecursiverly(null, head);
		// swap head to tail
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}

	private void reversepointerrecursiverly(Node prev, Node curr) {
		if (curr == null) {
			return;
		}

		reversepointerrecursiverly(curr, curr.next);
		curr.next = prev;

	}

	private class heapmover {
		Node left;
	}

	public void reversedatarecursively() {
//		heapmover mover = new heapmover();
//		mover.left = head;
//		reversedatarecursively(mover, head, 0);
		reversedatarecursively(head, head, 0);
	}

	private void reversedatarecursively(heapmover mover, Node right, int count) {
		if (right == null) {
			return;
		}
		reversedatarecursively(mover, right.next, count + 1);
		if (count >= this.size / 2) {
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;
		}
		mover.left = mover.left.next;

	}

	private Node reversedatarecursively(Node left, Node right, int count) {
		if (right == null) {
			return left;
		}
		Node cl = reversedatarecursively(left, right.next, count + 1);
		if (count >= this.size / 2) {
			int temp = cl.data;
			cl.data = right.data;
			right.data = temp;
		}
		return cl.next;

	}

	private class heapmover1 {
		Node left;
	}

	public void fold() {
		heapmover1 mover = new heapmover1();
		mover.left = head;
		fold(mover, head, 0);
	}

	private void fold(heapmover1 mover, Node right, int count) {
		if (right == null) {
			return;
		}
		fold(mover, right.next, count + 1);

		if (count > size / 2) {
			Node ahead = mover.left.next;
			mover.left.next = right;
			right.next = ahead;
			// mover update
			mover.left = ahead;
		}
		if (count == size / 2) {
			tail = right;
			tail.next = null;
		}

	}

	public int kthnodefromn(int k) {
		Node fast = head;
		Node slow = head;
		for (int i = 1; i <= k; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}

	private class heapmover2 {
		Node left;
	}

	public boolean palindrome() {
		heapmover2 mover = new heapmover2();
		mover.left = head;
		boolean res = palindrome(mover, head, 0);
		return res;
	}

	private boolean palindrome(heapmover2 mover, Node right, int count) {
		if (right == null) {
			return true;
		}
		boolean check = palindrome(mover, right.next, count + 1);
		if (mover.left.data != right.data) {
			mover.left = mover.left.next;
			return false;
		} else {
			mover.left = mover.left.next;
			return true && check;
		}

	}

	public void kreverse(int k) {
		this.head = kreverse(this.head, k);

	}

	private Node kreverse(Node n, int k) {
		if (n == null) {
			return null;
		}

		// to identify argument of smaller problem
		Node temp = n;
		for (int i = 1; i <= k && temp != null; i++) {
			temp = temp.next;

		}
		// smaller problem
		Node prev = kreverse(temp, k);
		// self work
		Node curr = n;
		while (curr != temp) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		return prev;

	}

	public void createdummylist() {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);
		Node n9 = new Node(90);
		Node n10 = new Node(100);
		Node n11 = new Node(110);
		Node n12 = new Node(120);
		Node n13 = new Node(130);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n13.next = n12;
		n12.next = n11;
		n11.next = n7;

		Node h1 = n1;
		Node h2 = n13;
		// intersection(h1, h2);

//		if (intersection2(h1, h2) != null) {
//			System.out.println(intersection2(h1, h2).data);
//		} else {
//			System.out.println("no intersection point");
//		}
		intersection3(h1, h2);
	}

	private void intersection(Node h1, Node h2) {
		Node fp = h1;
		Node sp = h2;
		while (fp != sp) {
			if (fp == null)
				fp = h2;
			else
				fp = fp.next;

			if (sp == null) {
				sp = h1;
			} else {
				sp = sp.next;
			}

		}
		System.out.println(fp.data);
	}

	private Node intersection2(Node h1, Node h2) {
		Node fp = h1;

		while (fp != null) {
			Node sp = h2;
			while (sp != null) {
				if (fp == sp) {
					return fp;
				} else {
					sp = sp.next;
				}
			}
			fp = fp.next;
		}
		return null;
	}

	private void intersection3(Node h1, Node h2) {
		Node fp = h1;
		Node sp = h2;
		int n = 0;
		int m = 0;
		while (fp != null) {
			fp = fp.next; 
			m++;
		}
		while (sp != null) {
			sp = sp.next;
			n++;
		}
		fp = h1;
		sp = h2;
		if (m > n) {
			for (int i = 1; i <= (m - n); i++) {
				fp = fp.next;
			}

		} else {
			for (int i = 1; i <= (n - m); i++) {
				sp = sp.next;
			}
		}
		while (fp != null) {
			if (fp == sp) {
				System.out.println(fp.data);
				return;
			}
			fp = fp.next;
			sp = sp.next;
		}

	}

	public void createdummylistloop() throws Exception {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n3;

		Node h1 = n1;
		// logic
		// System.out.println(detectloop(h1));

		Node loopheadnode = detectloopforremoval(h1);
		if (loopheadnode != null) {
			removeloop3(h1, loopheadnode);
			displayforlooplist(h1);
		} else {
			System.out.println("no loop for removal");
		}
	}

	public boolean detectloop(Node h1) {

		// floyd cycle detection algo
		Node slow = h1;
		Node fast = h1;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public Node detectloopforremoval(Node h1) {

		// floyd cycle detection algo
		Node slow = h1;
		Node fast = h1;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	public void displayforlooplist(Node head) throws Exception {

		if (size == 0) {
			throw new Exception("ll is empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}

		System.out.println("\n" + "------------");
	}

	public void removeloop1(Node h1, Node looph) {
		Node outer = h1;

		while (outer != looph) {
			Node inner = looph;
			while (inner.next != looph) {
				if (inner.next != outer) {
					inner = inner.next;
				} else {
					inner.next = null;
					return;
				}
			}
			outer = outer.next;

		}
	}

	public void removeloop2(Node h1, Node looph) {
		Node temp = looph;
		int cnt = 1;
		while (temp.next != looph) {
			cnt++;
			temp = temp.next;
		}
		Node slow = h1;
		Node fast = h1;
		// move fast cnt number of steps
		for (int i = 1; i <= cnt; i++) {
			fast = fast.next;
		}
		// now move slow and fast with same speed
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void removeloop3(Node h1, Node looph) {
		Node start = h1;
		Node loop = looph;
		while (start.next != loop.next) {
			start = start.next;
			loop = loop.next;
		}
		loop.next = null;
	}

	public void appendLastN(int n) throws Exception {

		if (n == 0) {
			return;

		}
		Node nt = getNodeat(size - 2);
		tail.next = head;
		head = tail;
		nt.next = null;
		tail = nt;
		// tail.next=null;
		appendLastN(n - 1);
	}

	public void deleteLarger() throws Exception {
		Node temp1 = this.head;
		int cnt = 0;

		Node temp2 = this.head;
		// Node temp3=this.head;
		while (temp1 != null) {
			int a = temp1.data;
			temp2 = temp1.next;
			temp1 = temp1.next;
			int flag = 0;

			while (temp2 != null) {
				int b = temp2.data;
				if (a < b) {
					this.removeat(cnt);
					flag = 1;

					break;

				}
				temp2 = temp2.next;
			}
			if (flag == 0)
				cnt++;
		}

	}

	public void merge_sorted_list(Linkedlist other) throws Exception {

		// write your code here
		Node temp1 = this.head;
		Node temp2 = other.head;
		Linkedlist merge = new Linkedlist();
		while (temp1 != null && temp2 != null) {

			if (temp1.data < temp2.data) {
				merge.addlast(temp1.data);
				temp1 = temp1.next;

			} else {
				merge.addlast(temp2.data);
				temp2 = temp2.next;

			}

		}
		while(temp1 != null) {
			merge.addlast(temp1.data);
			temp1 = temp1.next;
		}
		while(temp2 != null) {
			merge.addlast(temp2.data);
			temp2 = temp2.next;
		}

		merge.display1();

	}

	public Linkedlist sumoftwoll(Linkedlist list2) throws Exception {
		int n = this.size;
		int m = list2.size;

		Linkedlist sumlist = new Linkedlist();
		if (n > m) {
			int sum = 0, ref = 0, rem = 0;
			for (int i = 1; i <= m; i++) {
				sum = 0;
				sum = this.getat(n - i) + list2.getat(m - i) + rem;
				ref = sum;
				sumlist.addfirst(ref % 10);

				rem = sum / 10;

			}
			for (int i = (n - m) - 1; i >= 0; i--) {
				sum = this.getat(i) + rem;

				ref = sum;
				sumlist.addfirst(ref % 10);

				rem = sum / 10;

				if (i == 0 && rem != 0) {
					sumlist.addfirst(rem);

				}
			}

		} else {
			int sum = 0, ref = 0, rem = 0;
			for (int i = 1; i <= n; i++) {
				sum = 0;
				sum = this.getat(n - i) + list2.getat(m - i) + rem;
				ref = sum;
				sumlist.addfirst(ref % 10);

				rem = sum / 10;
				if (n == m && i == n && rem != 0) {

					sumlist.addfirst(rem);
				}

			}
			for (int i = (m - n) - 1; i >= 0; i--) {
				sum = this.getat(i) + rem;

				ref = sum;
				sumlist.addfirst(ref % 10);

				rem = sum / 10;

				if (i == 0 && rem != 0) {
					sumlist.addfirst(rem);

				}
			}
		}
		return sumlist;

	}

	public Linkedlist tripledlist(Linkedlist list2, Linkedlist list3, int tar) throws Exception {

		int sum = 0;
		Node temp1 = this.head;
		Node temp2 = list2.head;
		Node temp3 = list3.head;
		int flag = 0;
		Linkedlist triplet = new Linkedlist();
		while (temp1 != null) {
			int a = temp1.data;

			temp2 = list2.head;
			while (temp2 != null) {
				int b = temp2.data;

				temp3 = list3.head;
				while (temp3 != null) {
					sum = 0;
					int c = temp3.data;

					sum = a + b + c;
					// System.out.println(sum);
					if (sum == tar) {
						flag = 1;
						triplet.addlast(a);
						triplet.addlast(b);
						triplet.addlast(c);
						break;

					}
					temp3 = temp3.next;

				}
				if (flag == 1) {
					break;
				}
				temp2 = temp2.next;

			}
			if (flag == 1) {
				break;
			}
			temp1 = temp1.next;

		}
		return triplet;

	}

	public void lloddeven() throws Exception {
		Linkedlist oddeven = new Linkedlist();
		Node temp = this.head;
		while (temp != null) {
			int num = temp.data;
			if (num % 2 != 0) {
				oddeven.addlast(num);
			}
			temp = temp.next;
		}
		temp = this.head;
		while (temp != null) {
			int num = temp.data;
			if (num % 2 == 0) {
				oddeven.addlast(num);
			}
			temp = temp.next;
		}
		temp = this.head;
		Node temp2 = oddeven.head;
		while (temp != null) {
			temp.data = temp2.data;
			temp2 = temp2.next;

			temp = temp.next;
		}

	}
}
