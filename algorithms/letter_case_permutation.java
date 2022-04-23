package algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class letter_case_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lettercase("12345"));

	}

	public static ArrayList<String> lettercase(String str) {
		if(str.length()==0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		char ch = str.charAt(0);
		String roq = str.substring(1);

		if (ch >= 'A' && ch <= 'Z') {
			ArrayList<String> br1 = lettercase(roq);
			for (String val : br1) {
				mr.add(ch + val);
				mr.add((char) (ch + 32) + val);

			}
		}

		else if (ch >= 'a' && ch <= 'z') {
			ArrayList<String> br2 = lettercase(roq);
			for (String val : br2) {
				mr.add(ch + val);
				mr.add((char) (ch - 32) + val);

			}
		} else {
			ArrayList<String> br3 = lettercase(roq);
			for (String val : br3) {
				mr.add(ch + val);

			}

		}

		return mr;
	}

}
