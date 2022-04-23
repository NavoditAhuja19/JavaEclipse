package leetcode;

import java.util.HashMap;

public class anangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean isAnagram(String s, String t) {
    	if(s.length()!=t.length()) {
    		return false;
    	}
    	HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++) {
        	int ov=map.getOrDefault(s.charAt(i), 0);
        	map.put(s.charAt(i), ov+1);
        }
        for(int i=0;i<s.length();i++) {
        	if(!map.containsKey(t.charAt(i))) {
        		return false;
        	}else {
        		int ov=map.get(t.charAt(i));
        		if(ov==0) {
        			return false;
        		}
        		map.put(t.charAt(i), ov-1);
        	}
        }
        return true;
        
    }

}
