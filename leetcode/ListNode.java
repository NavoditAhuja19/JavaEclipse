package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.w3c.dom.NodeList;

// Definition for singly-linked list.
public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution1 {
	public boolean isPalindrome(ListNode head) {
		ListNode temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		if (size <= 1) {
			return true;
		}
		temp = head;
		ListNode first = null;
		ListNode last = null;
		ListNode prev = null;
		int cnt = 0;
		while (cnt < size / 2) {
			first = temp;
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			last = temp;
			prev.next = null;

			if (first.val != last.val) {
				return false;
			}
			temp = first;
			temp = temp.next;
			cnt++;
		}
		return true;
	}

	public ListNode reverseList(ListNode head) {

		ListNode prev = head;
		ListNode curr = prev.next;
		while (curr != null) {
			ListNode ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		head = prev;
		return head;

	}

	public ListNode reverseBetween(ListNode head, int m, int n) {

		if (m == n) {
			return head;
		}
		ListNode first = head;
		ListNode temp = head;
		int cnt = 1;
		while (cnt < m) {
			first = temp;
			temp = temp.next;
			cnt++;

		}
		if (m == 1) {
			first = null;
		}
		ListNode prev = temp;
		ListNode start = temp;
		cnt = 1;
		temp = head;
		while (cnt < n) {
			temp = temp.next;

			cnt++;
		}

		ListNode curr = prev.next;
		while (curr != temp) {
			ListNode ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		if (first != null) {
			first.next = curr;
		}
		ListNode next = curr.next;
		curr.next = prev;
		start.next = next;
		if (first == null) {
			head = curr;
		}

		return head;

	}

	public ListNode sortList(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;
		// to break list in 2 parts
		while (slow.next != null && fast.next != null) {

			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		ListNode l1 = sortList(head);
		ListNode l2 = sortList(slow);
		ListNode ans = mergeTwoLists(l1, l2);
		return ans;

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		ListNode merge = new ListNode();
		ListNode head = merge;
		while (temp1 != null && temp2 != null) {
			if (temp1.val <= temp2.val) {
				ListNode nn = new ListNode();
				merge.val = temp1.val;
				merge.next = nn;
				merge = merge.next;
				temp1 = temp1.next;
			} else {
				ListNode nn = new ListNode();
				merge.val = temp2.val;
				merge.next = nn;
				merge = merge.next;
				temp2 = temp2.next;

			}
		}
		while (temp1 != null) {
			ListNode nn = new ListNode();
			merge.val = temp1.val;
			merge.next = nn;
			merge = merge.next;
			temp1 = temp1.next;
		}
		while (temp2 != null) {
			ListNode nn = new ListNode();
			merge.val = temp2.val;
			merge.next = nn;
			merge = merge.next;
			temp2 = temp2.next;

		}
		ListNode temp = head;
		ListNode tempans = temp;
		while (tempans.next.next != null) {
			tempans = tempans.next;
		}
		tempans.next = null;

		return temp;

	}

	public void reorderList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {

			ListNode start = temp;
			ListNode next = temp.next;
			if (temp.next == null || temp.next.next == null) {
				break;
			}
			while (temp.next.next != null) {

				temp = temp.next;
			}
			ListNode slast = temp;
			ListNode last = temp.next;
			// update list;
			start.next = last;
			last.next = next;
			slast.next = null;
			temp = next;
		}

	}

	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode temp = null;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				temp = slow;
				break;
			}
		}
		if (temp == null) {
			return null;
		}
		slow = head;
		while (slow.next != temp.next) {
			temp = temp.next;
			slow = slow.next;
		}
		temp = temp.next;
		return temp;

	}

	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public ListNode partition(ListNode head, int x) {
		ListNode partition = new ListNode();
		ListNode temp = new ListNode();
		ListNode ans = new ListNode();
		ans = partition;
		temp = head;
		while (temp != null) {
			if (temp.val < x) {
				ListNode nn = new ListNode();

				partition.val = temp.val;
				partition.next = nn;
				partition = partition.next;
			}
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			if (temp.val >= x) {
				ListNode nn = new ListNode();

				partition.val = temp.val;
				partition.next = nn;
				partition = partition.next;
			}
			temp = temp.next;
		}
		temp = ans;
		ListNode temp2 = temp;
		while (temp2.next.next != null) {
			temp2 = temp2.next;
		}
		temp2.next = null;

		return temp;

	}

	public int numComponents(ListNode head, int[] G) {

		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < G.length; i++) {
			map.put(G[i], true);
		}

		ListNode temp = new ListNode();
		temp = head;
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> t = new ArrayList<>();
		while (temp != null) {

			if (map.containsKey(temp.val)) {
				t.add(temp.val);
			} else {
				if (t.size() != 0) {
					list.add(t);

				}
				t = new ArrayList<>();
			}
			temp = temp.next;

		}
		if (t.size() != 0) {
			list.add(t);
		}
		return list.size();

	}

	public ListNode oddEvenList(ListNode head) {
		ListNode oddeven = new ListNode();
		ListNode ans = null;
		ListNode temp = head;
		int cnt = 1;
		while (temp != null) {
			int num = temp.val;
			if (cnt % 2 != 0) {
				ListNode nn = new ListNode();
				oddeven.val = num;
				if (cnt == 1) {
					ans = oddeven;

				}
				oddeven.next = nn;
				oddeven = oddeven.next;

			}
			cnt++;
			temp = temp.next;
		}
		temp = head;
		cnt = 1;
		while (temp != null) {
			int num = temp.val;
			if (cnt % 2 == 0) {
				ListNode nn = new ListNode();
				oddeven.val = num;
				oddeven.next = nn;
				oddeven = oddeven.next;
			}
			cnt++;
			temp = temp.next;
		}
		if (cnt == 1) {
			return ans;
		}
		temp = ans;
		ListNode temp2 = temp;
		while (temp2.next.next != null) {
			temp2 = temp2.next;
		}
		temp2.next = null;

		return temp;

	}

	public ListNode deleteDuplicates1(ListNode head) {
		ListNode temp = new ListNode();
		temp = head;
		int cnt = 0;
		while (head != null) {
			cnt++;
			head = head.next;
		}
		head = temp;
		if (cnt <= 1) {
			return temp;
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < cnt; i++) {
			int ov = map.getOrDefault(head.val, 0);
			map.put(head.val, ov + 1);

			head = head.next;
		}
		head = temp;
		cnt = 0;
		for (int key : map.keySet()) {
			if (map.get(key) == 1) {

				cnt++;
			}
		}
		int[] arr = new int[cnt];
		cnt = 0;
		for (int key : map.keySet()) {
			if (map.get(key) == 1) {
				arr[cnt] = key;
				cnt++;
			}
		}

		if (cnt == 0) {
			return null;
		}
		ListNode ans = new ListNode();
		temp = ans;
		Arrays.sort(arr);

		for (int i = 0; i < cnt; i++) {
			ans.val = arr[i];
			// System.out.println(arr[i]);
			ListNode nn = new ListNode();
			ans.next = nn;
			ans = ans.next;

		}

		ListNode temp2 = temp;
		while (temp2.next.next != null) {
			temp2 = temp2.next;
		}
		temp2.next = null;

		return temp;

	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode temp = new ListNode();
		temp = head;
		int cnt = 0;
		while (head != null) {
			cnt++;
			head = head.next;
		}
		if (cnt <= 1) {
			return temp;
		}
		head = temp;
		int[] arr = new int[cnt];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = head.val;
			head = head.next;
		}
		head = temp;
		int len = removeDuplicates(arr);
		ListNode ans = new ListNode();
		temp = ans;
		for (int i = 0; i < len; i++) {
			ans.val = arr[i];
			// System.out.println(arr[i]);
			ListNode nn = new ListNode();
			ans.next = nn;
			ans = ans.next;

		}
		ListNode temp2 = temp;
		while (temp2.next.next != null) {
			temp2 = temp2.next;
		}
		temp2.next = null;

		return temp;

	}

	public int removeDuplicates(int[] nums) {
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				nums[cnt] = nums[i];
				cnt++;
			}
		}
		return cnt;

	}

	public ListNode rotateRight(ListNode head, int k) {
		ListNode temp = new ListNode();
		temp = head;
		int cnt = 0;
		while (head != null) {
			cnt++;
			head = head.next;
		}
		head = temp;

		k = k % cnt;
		while (k > 0) {
			temp = head;
			ListNode prev = null;
			for (int i = 0; i < cnt - 1; i++) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
			temp.next = head;
			head = temp;
			k--;

		}
		return head;

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = new ListNode();
		temp = head;
		int cnt = 0;
		while (head != null) {
			cnt++;
			head = head.next;
		}
		head = temp;
		ListNode ans = head;
		int ntbr = cnt - n + 1;
		cnt = 0;
		ListNode curr = null;
		ListNode next = null;
		ListNode nn = null;
		while (cnt < ntbr) {

			if (ntbr == 1) {
				head = head.next;
				ans = head;
				break;

			}
			if (cnt == ntbr - 2) {
				curr = temp;
				next = curr.next;
				nn = next.next;
				curr.next = nn;
				break;
			}
			temp = temp.next;
			cnt++;
		}
		return ans;

	}

	public ListNode swapPairs(ListNode head) {

		ListNode temp = new ListNode();
		temp = head;
		int cnt = 0;
		while (head != null) {
			cnt++;
			head = head.next;
		}
		if (cnt <= 1) {
			return temp;
		}
		ListNode curr = null;
		ListNode prev = null;
		ListNode n = null;
		ListNode nn = null;
		ListNode ans = null;

		int count = 1;

		while (temp != null && count <= (cnt / 2)) {

			if (prev == null) {
				curr = temp;
				n = temp.next;
				nn = n.next;

				// update
				n.next = curr;
				curr.next = nn;
				prev = curr;
				ans = n;
				temp = nn;

			} else {
				curr = temp;
				n = temp.next;
				nn = n.next;
				// updates
				prev.next = n;
				n.next = curr;
				curr.next = nn;
				prev = curr;
				temp = nn;

			}
			count++;

		}
		return ans;

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode one = l1;
		ListNode two = l2;
		ListNode ans = new ListNode();
		ListNode temp = ans;

		int rem = 0;
		while (one != null || two != null) {

			int num1 = one.val;
			int num2 = two.val;
			int sum = num1 + num2 + rem;
			if (sum <= 9) {
				ans.val = sum;
				ListNode nn = new ListNode();
				ans.next = nn;
				ans = ans.next;
				rem = 0;

			} else {
				rem = sum % 10;
				sum = sum / 10;
				ans.val = sum;
				ListNode nn = new ListNode();
				ans.next = nn;
				ans = ans.next;
			}
			two = two.next;
			one = one.next;
		}
		while (two != null) {
			int num2 = two.val;
			int sum = num2 + rem;
			if (sum <= 9) {
				ans.val = sum;
				ListNode nn = new ListNode();
				ans.next = nn;
				ans = ans.next;
				rem = 0;

			} else {
				rem = sum % 10;
				sum = sum / 10;
				ans.val = sum;
				ListNode nn = new ListNode();
				ans.next = nn;
				ans = ans.next;
			}
			two = two.next;

		}
		while (one != null) {
			int num1 = one.val;
			int sum = num1 + rem;
			if (sum <= 9) {
				ans.val = sum;
				ListNode nn = new ListNode();
				ans.next = nn;
				ans = ans.next;
				rem = 0;

			} else {
				rem = sum % 10;
				sum = sum / 10;
				ans.val = sum;
				ListNode nn = new ListNode();
				ans.next = nn;
				ans = ans.next;
			}
			two = two.next;

		}
		if (rem != 0) {
			ans.val = rem;
			ListNode nn = new ListNode();
			ans.next = nn;
		}
		ListNode temp2 = temp;
		while (temp2.next.next != null) {
			temp2 = temp2.next;
		}
		temp2.next = null;

		return temp;

	}
}
