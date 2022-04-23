package leetcode;

import java.util.HashMap;

public class wordpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(wordPattern("he", "unit"));
	}

	public static boolean wordPattern(String pattern, String str) {
		HashMap<Character, String> map = new HashMap<>();
		int j = 0;
		String key = "";
		for (int i = 0; i < pattern.length(); i++) {

			key = "";
			while (j < str.length() && str.charAt(j) != ' ') {

				key = key + str.charAt(j);
				j++;

			}

			if (j >= str.length() || str.charAt(j) == ' ') {

				if (map.containsKey(pattern.charAt(i))) {
					// System.out.println(map.get(pattern.charAt(i)));
					if (!map.get(pattern.charAt(i)).equals(key))
						return false;
					else {
						j++;
						continue;
					}
				}
				if (map.containsValue(key)||key.equals("")) {
					return false;
				}
				map.put(pattern.charAt(i), key);

				j++;
			}

		}
		if (j < str.length()) {
			return false;
		}
		return true;

	}

}
