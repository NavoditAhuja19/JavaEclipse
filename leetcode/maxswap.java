package leetcode;

public class maxswap {
	public static void main(String[] args) {
		System.out.println(maximumSwap(2763));
	}

	public static int maximumSwap(int num) {
		int n = num;
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		n = num;
		int cnt = count - 1;
		int[] a = new int[count];
		while (n > 0) {
			a[cnt] = n % 10;
			n = n / 10;
			cnt--;
		}
		int max = 0;
		int pos = -1;
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] - a[i] > max) {
					max = a[j] - a[i];
					pos = j;
				}
			}
			if (pos == -1) {
				continue;

			}
			int temp = a[pos];
			a[pos] = a[i];
			a[i] = temp;
			break;

		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int add = a[i] * (int) (Math.pow(10, a.length - i - 1));
			sum += add;
		}

		return sum;
	}

}
