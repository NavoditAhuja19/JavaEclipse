package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ipaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(restoreIpAddresses("010010"));

	}

	public static List<String> restoreIpAddresses(String s) {
		List<String> main = new ArrayList<>();
		restoreIpAddresses(s, "", 0, main);

		return main;
	}

	private static void restoreIpAddresses(String ques, String ans, int dots, List<String> main) {

		if ( dots == 4) {
			if(ques.length() == 0 )
			main.add(ans.substring(0, ans.length() - 1));
			// main.remove(main.size()-1);

			return;
		}
		for (int i = 1; i <= ques.length() && i <= 3; i++) {
			String part = ques.substring(0, i);
			String roq = ques.substring(i);
			int num = Integer.parseInt(part);
			if (leadingzeroes(part)) {
				if (num <= 255) {
					restoreIpAddresses(roq, ans + part + ".", dots + 1, main);
				}
			}

		}

	}

	private static boolean leadingzeroes(String part) {
		if(part.length()>1) {
			if(part.charAt(0)=='0') {
			return false;}
			
		}
	
		
		return true;
	}

}
