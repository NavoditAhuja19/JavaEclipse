package lec9;

import java.util.ArrayList;

public class getkpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getkpc("12"));

	}

	public static ArrayList<String> getkpc(String str) {
		if(str.length()==0)
		{
			ArrayList<String> br=new ArrayList<>();
			br.add("");
			return br;
			
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getkpc(ros);
		ArrayList<String> mr = new ArrayList<>();

		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			for (String val : rr) {

				mr.add(code.charAt(i)+val);
			}
		}
		return mr;

	}

	public static String getCode(char ch) {
		if (ch == '1') {
			return "abc";
		} else if (ch == '2') {
			return "def";
		} else if (ch == '3') {
			return "lm";
		} else {
			return "pq";
		}

	}

}
