package leetcode;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class isomorphicstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isIsomorphic(String s, String t) {

		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char chs = s.charAt(i);
			char cht = t.charAt(i);

			if (map.containsKey(chs)) {
				if (map.get(chs) != cht)
					return false;
				else
					continue;
			}

			if (map.containsValue(t.charAt(i))) {
				return false;
			}
			map.put(t.charAt(i), s.charAt(i));
		}

		return true;
	}

}
