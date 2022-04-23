package algorithms;

public class program {
	// Function to print the maximum number
	static int printMaxNum(int N) {

		int count[] = new int[10];

		String str = Integer.toString(N);

		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i) - '0']++;

		int result = 0, multiplier = 1;

		for (int i = 0; i <= 9; i++) {
			while (count[i] > 0) {
				result = result + (i * multiplier);
				count[i]--;
				multiplier = multiplier * 10;
			}
		}
		if (result > 100000000)
			return -1;

		return result;
	}

	// Driver program to test above function
	public static void main(String[] args) {
		int num = 12;
		System.out.println(printMaxNum(num));
	}
}