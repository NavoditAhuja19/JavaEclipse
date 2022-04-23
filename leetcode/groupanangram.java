package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class groupanangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> main = new ArrayList<>();
		List<String> str = new ArrayList<>();
		for (int i = 0; i < strs.length; i++) {
			str.add(strs[i]);
		}
		for (int i = 0; i < str.size(); i++) {

			String s = str.get(i);
			HashMap<Character, Integer> map = new HashMap<>();
			for (int j = 0; j < s.length(); j++) {
				int ov = map.getOrDefault(s.charAt(j), 0);
				map.put(s.charAt(j), ov + 1);
			}

			List<String> temp = new ArrayList<>();
			for (int k = str.size() - 1; k > i; k--) {
				String sk = str.get(k);
				HashMap<Character, Integer> ans=new HashMap<>();
				ans=map;
				if (isAnagram(s, sk,ans)) {
					temp.add(sk);
					str.remove(k);

				}

			}
			temp.add(s);
			main.add(new ArrayList<>(temp));
		}
		return main;

	}

	public boolean isAnagram(String s, String t,HashMap<Character, Integer> map) {
		if (s.length() != t.length()) {
			return false;
		}
//		HashMap<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < s.length(); i++) {
//			int ov = map.getOrDefault(s.charAt(i), 0);
//			map.put(s.charAt(i), ov + 1);
//		}

		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(t.charAt(i))) {
				return false;
			} else {
				int ov = map.get(t.charAt(i));
				if (ov == 0) {
					return false;
				}
				map.put(t.charAt(i), ov - 1);
			}
		}
		return true;

	}

}
