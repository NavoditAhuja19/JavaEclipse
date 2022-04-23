package leetcode;

public class zigzagconversion {
	public static void main(String[] args) {
		System.out.println(convert("AB", 1));
	}

	public static String convert(String s, int numRows) {
		int cnt = 0;
		char[][] ch = new char[s.length()][numRows];
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < numRows; j++) {
				ch[i][j] = '\0';
			}
		}
		int i = 0;
		int j = 0;
		boolean jinc = true;
		while (cnt < s.length()) {
			if (jinc && j < numRows - 1) {
				ch[i][j] = s.charAt(cnt);
				j++;
				cnt++;

			} else if (jinc && j == numRows - 1) {
				ch[i][j] = s.charAt(cnt);
				if (j > 0)
					j--;
				i++;
				cnt++;
				jinc = false;
			} else if (!jinc && j > 0) {
				ch[i][j] = s.charAt(cnt);
				j--;
				i++;
				cnt++;

			} else if (!jinc && j == 0) {
				ch[i][j] = s.charAt(cnt);
				jinc = true;
				cnt++;
				j++;

			}

		}
		String str = "";
		for (int m = 0; m < numRows; m++) {
			for (int l = 0; l < s.length(); l++) {
				if (ch[l][m] != '\0') {
					str = str + ch[l][m];
				}
			}
		}
		return str;

	}

}
