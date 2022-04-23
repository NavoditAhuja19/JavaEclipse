package lect25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Trie {
	private class Node {
		char data;
		Map<Character, Node> children;
		boolean isTerminal;

		Node(char data, boolean isTerminal) {
			this.data = data;
			this.isTerminal = isTerminal;
			children = new HashMap<>();
		}
	}

	private Node root;
	private int numwords;

	Trie() {
		root = new Node('\0', false);
		numwords = 0;

	}

	public void addword(String word) {

		addword(root, word);
	}

	private void addword(Node parent, String word) {

		if (word.length() == 0) {
			if (parent.isTerminal) {

				return;
			} else {
				parent.isTerminal = true;
				numwords++;
				return;
			}
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child == null) {
			child = new Node(cc, false);
			parent.children.put(cc, child);
		}
		addword(child, ros);

	}

	public int numwords() {
		return numwords;
	}

	public void display() {
		display(root, "");
	}

	private void display(Node node, String osf) {
		if (node.isTerminal) {
			String word = osf.substring(1) + node.data;
			System.out.println(word);
		}
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			display(entry.getValue(), osf + node.data);
		}

	}

	public boolean search(String word) {
		return search(root, word);
	}

	private boolean search(Node parent, String word) {
		if (word.length() == 0) {
			if (parent.isTerminal) {
				return true;
			} else {
				return false;
			}
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child == null) {
			return false;

		}
		return search(child, ros);

	}
}
