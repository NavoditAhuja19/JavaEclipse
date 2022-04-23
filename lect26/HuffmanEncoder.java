package lect26;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lect24.HeapGeneric;

public class HuffmanEncoder {
	HashMap<Character, String> encoder;
	HashMap<String, Character> decoder;

	public HuffmanEncoder(String input) {
		HashMap<Character, Integer> freqmap = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			int ov = freqmap.getOrDefault(input.charAt(i), 0);
			freqmap.put(input.charAt(i), ov + 1);

		}
		System.out.println(freqmap);
		HeapGeneric<Node> minheap = new HeapGeneric<>();
		Set<Map.Entry<Character, Integer>> entries = freqmap.entrySet();
		for (Map.Entry<Character, Integer> entry : entries) {
			Node nn = new Node(entry.getKey(), entry.getValue());
			minheap.add(nn);

		}
		while (minheap.size() != 1) {

			Node one = minheap.remove();
			Node two = minheap.remove();
			Node combine = new Node(two, one);
			combine.cost = one.cost + two.cost;
			combine.data = '\0';
			minheap.add(combine);

		}
		Node ft = minheap.remove();
		encoder = new HashMap<>();
		decoder = new HashMap<>();
		this.initencoderdecoder(ft, "");
	}

	public void initencoderdecoder(Node node, String osf) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			encoder.put(node.data, osf);
			decoder.put(osf, node.data);

		}
		initencoderdecoder(node.left, osf + 0);
		initencoderdecoder(node.right, osf + 1);
	}

	public String encode(String source) {
		String ans = "";
		for (int i = 0; i < source.length(); i++) {
			String code = encoder.get(source.charAt(i));

			ans = ans + code;
		}

		return ans;
	}

	public String decode(String Codedstring) {
		String ans = "";
		String key = "";
		for (int i = 0; i < Codedstring.length(); i++) {
			key = key + Codedstring.charAt(i);
			if (decoder.containsKey(key)) {
				ans = ans + decoder.get(key);
				key = "";
			}
		}

		return ans;
	}

	private class Node implements Comparable<Node> {

		char data;
		int cost;
		Node left;
		Node right;

		Node(char data, int cost) {
			this.data = data;
			this.cost = cost;
			this.left = null;
			this.right = null;

		}

		Node(Node left, Node right) {

			this.left = left;
			this.right = right;

		}

		@Override
		public int compareTo(Node other) {

			return other.cost - this.cost;
		}

		@Override
		public String toString() {
			String str = this.data + "-->" + this.cost;
			return str;

		}

	}

}
