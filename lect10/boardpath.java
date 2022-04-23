package lect10;

import java.util.ArrayList;

public class boardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(boardpath(0, 10));

	}

	public static ArrayList<String> boardpath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;

		}
//		if(curr>end) {
//			ArrayList<String> br=new ArrayList<>();
//		
//			return br;
//			
//		}
		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6 && dice + curr <= end; dice++) {
			ArrayList<String> rr = boardpath(curr + dice, end);
			for (String val : rr) {
				mr.add(dice + val);
			}

		}
		return mr;

	}

}
