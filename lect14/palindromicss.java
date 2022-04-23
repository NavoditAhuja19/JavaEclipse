package lect14;

public class palindromicss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palindromic_ss("aaa");
	}

	public static void palindromic_ss(String str) {
		int count = 0;
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; (axis - orbit) >= 0 && (orbit + axis) < str.length(); orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(orbit + axis)) {
					count++;
				} else
					break;
			}
		}
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && orbit + axis < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (orbit + axis))) {
					count++;
				} else
					break;
			}

		}
		System.out.println(count);
	}

}
