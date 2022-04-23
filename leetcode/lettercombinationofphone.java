package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lettercombinationofphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(letterCombinations("12"));

	}

	public  List<String> letterCombinations(String digits) {
		List<String> list = getkpc(digits, 0);
		return list;
	}

	public  ArrayList<String> getkpc(String str, int vidx) {
        if(str.length() == 0){
            ArrayList<String> br = new ArrayList<>();
			
			return br;
        }
		if (str.length() == vidx) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		char ch = str.charAt(vidx);
        if(ch=='0'){
       ArrayList<String> br = new ArrayList<>();
		
			return br;
           
        }
		ArrayList<String> rr = getkpc(str, vidx + 1);
		ArrayList<String> mr = new ArrayList<>();

		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			for (String val : rr) {

				mr.add(code.charAt(i) + val);
			}
		}
		return mr;

	}

	public  String getCode(char ch) {
		if (ch == '1') {
			return "";
		} else if (ch == '2') {
			return "abc";
		} else if (ch == '3') {
			return "def";
		} else if (ch == '4') {
			return "ghi";
		} else if (ch == '5') {
			return "jkl";
		} else if (ch == '6') {
			return "mno";
		} else if (ch == '7') {
			return "pqrs";
		} else if (ch == '8') {
			return "tuv";
		} else if (ch == '9') {
			return "wxyz";
		} else if (ch == '0') {
			return "_";
		} else if (ch == '*') {
			return "downcast of";
		} else {
			return "dynamic operation on";
		}

	}
}
