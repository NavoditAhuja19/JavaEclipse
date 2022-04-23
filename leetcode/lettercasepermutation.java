package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lettercasepermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCasePermutation("a1b2"));

	}
	 public static List<String> letterCasePermutation(String S) {
		 List<String> main=new ArrayList<>();
		 StringBuilder str=new StringBuilder(S);
		 letterCasePermutation(str,0,main);
		 
		 return main;
	    }
	private static void letterCasePermutation(StringBuilder s, int i, List<String> main) {
		if(i==s.length()) {
			main.add(s.toString());
			return;
		}
		
		char ch=s.charAt(i);
		if(Character.isAlphabetic(ch)) {
			s.setCharAt(i, Character.toLowerCase(ch));
			letterCasePermutation(s, i+1, main);
			s.setCharAt(i, Character.toUpperCase(ch));
			
			letterCasePermutation(s, i+1, main);
		}
		else {
			letterCasePermutation(s, i+1, main);
		}
		
	}

}
