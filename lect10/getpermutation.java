package lect10;

import java.util.ArrayList;

public class getpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(get_permutation("abc"));

	}

	public static ArrayList<String> get_permutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

			
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = get_permutation(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			for (int i = 0; i <= val.length(); i++) {
				String res = val.substring(0, i) + ch + val.substring(i);
//			StringBuilder res=new StringBuilder(val);
//			res.insert(i,ch);
//			mr.add(res.toString());
				mr.add(res);
			}
		}
		return mr;

	}

}
