package lect10;

import java.util.ArrayList;

public class mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maze_path(0, 0, 2, 2));

	}

	public static ArrayList<String> maze_path(int cc, int cr, int ec, int er) {

		if (cc == ec && cr == er) {
			ArrayList<String> br = new ArrayList<>();

			br.add("");
			return br;

		}

		ArrayList<String> mr = new ArrayList<>();

//		if(cc>ec||cr>er)
//		{
//			ArrayList<String> br = new ArrayList<>();
//			return br;
//			
//		}

		if (cc + 1 <= ec) {
			ArrayList<String> rrh = maze_path(cc + 1, cr, ec, er);
			for (String val : rrh) {
				mr.add("h" + val);
			}
		}

		if (cr + 1 <= er) {
			ArrayList<String> rrv = maze_path(cc, cr + 1, ec, er);
			for (String val : rrv) {
				mr.add("v" + val);
			}
		}
		return mr;
	}

}
