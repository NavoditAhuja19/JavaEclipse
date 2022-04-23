package leetcode;

public class addbinary {
	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
	}
	public static String addBinary(String a, String b) {

		int i = a.length()-1 ;
		int j = b.length() -1;
		String str = "";
		int rem = 0;
		int sum = 0;
		while (i >= 0 && j >= 0) {
		

			String  aa= ""+a.charAt(i);
			String bb = ""+b.charAt(j);

			int rema=Integer.parseInt(aa);
			int remb=Integer.parseInt(bb);
			i--;
			j--;

			sum = rema + remb + rem;

			if (sum == 2) {
				str = 0 + str;
				rem = 1;
			} else if (sum == 3) {
				str = 1 + str;
				rem = 1;

			} else {
				str = sum + str;
				rem = 0;

			}

		}
		while (i >= 0) {
			String  aa= ""+a.charAt(i);
		

			int rema=Integer.parseInt(aa);
	
			i--;

			sum = rema + rem;

			if (sum == 2) {
				str = 0 + str;
				rem = 1;
			} else {
				str = sum + str;
				rem = 0;

			}

		}
		while (j >=0) {
		
			String bb = ""+b.charAt(j);

		
			int remb=Integer.parseInt(bb);

			j--;

			sum = remb + rem;

			if (sum == 2) {
				str = 0 + str;
				rem = 1;
			} else {
				str = sum + str;
				rem = 0;

			}

		}
		if (rem != 0) {
			str = rem + str;
		}
		return str;

	}

}
