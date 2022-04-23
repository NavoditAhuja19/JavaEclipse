package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class repeateddna {
	public List<String> findRepeatedDnaSequences(String s) {
		List<String> list = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			int cnt = 0;
			String str = "";
			while (cnt < 10) {
				str = str + s.charAt(i + cnt);
				cnt++;
			}
			int ov=map.getOrDefault(str, 0);
			map.put(str, ov+1);
		}
		for(String key:map.keySet()) {
			if(map.get(key)>1) {
				list.add(key);
			}
		}
		return list;
	}
}
