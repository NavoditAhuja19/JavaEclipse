package leetcode;

import java.util.ArrayList;
import java.util.List;

public class binarywatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(readBinaryWatch(2));
	}

	public static List<String> readBinaryWatch(int num) {
		List<String> main = new ArrayList<>();
		int[] arr = { 1, 2, 4, 8, 1, 2, 4, 8, 16, 32 };
		readBinaryWatch(num, arr, 0, 0, 0, main);
		return main;
	}

	private static void readBinaryWatch(int num, int[] arr, int idx, int hours, int min, List<String> main) {

		if(hours>=12||min>=60) {
			return;
		}
		
		if (num == 0) {
			String str = "";
			if (min <= 9) {
				str = hours + ":0" + min;
			} else {
				str = hours + ":" + min;
			}
			main.add(str);
			return;

		}
		if(arr.length==idx) {
			return;
		}
		if (idx <= 3) {
			readBinaryWatch(num - 1, arr, idx + 1, hours + arr[idx], min, main);
		} else {
			readBinaryWatch(num - 1, arr, idx + 1, hours, min + arr[idx], main);
		}
		// no
		readBinaryWatch(num, arr, idx + 1, hours, min, main);

	}

}
