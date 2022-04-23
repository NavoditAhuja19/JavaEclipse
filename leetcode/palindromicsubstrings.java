package leetcode;

public class palindromicsubstrings {
	  public int countSubstrings(String s) {
			int count = 0;
			for (int axis = 0; axis < s.length(); axis++) {
				for (int orbit = 0; (axis - orbit) >= 0 && (orbit + axis) < s.length(); orbit++) {
					if (s.charAt(axis - orbit) == s.charAt(orbit + axis)) {
						count++;
					} else
						break;
				}
			}
			for (double axis = 0.5; axis < s.length(); axis++) {
				for (double orbit = 0.5; axis - orbit >= 0 && orbit + axis < s.length(); orbit++) {
					if (s.charAt((int) (axis - orbit)) == s.charAt((int) (orbit + axis))) {
						count++;
					} else
						break;
				}

			}
			return count;
	        
	    }

}
