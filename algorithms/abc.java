package algorithms;

	//package HackblockPractise;

	import java.util.Scanner;

	public class abc {
		static Scanner scn = new Scanner(System.in);
		static int q = 0;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//System.out.println("Enter the number of test cases");
			int t = scn.nextInt();
			for (int ii = 1; ii <= t; ii++) {
				int arr[] = takeInput();
				int sum[] = new int[arr.length];
			//	for (int val : arr)
				//	System.out.print(val + "  ");

				for (int j = 0; j < arr.length; j++) {
					sum[j] = maxcirclesum(arr);
					// System.out.println(++q + "-----> intermediate " + sum[j]);
					rotate(arr,1);
					// display(arr);
					//for (int val : arr)
					//	System.out.print(val + "  ");
					//System.out.println();

				}

				int max = sum[0];
				for (int i = 0; i < sum.length; i++) {
					if (max < sum[i])
						max = sum[i];
				}
			//	System.out.println("Maximum Circular Sum = " + max);
	      System.out.println(max);
			}

		}

		public static int[] takeInput() {
		//	System.out.println("Enter the size of array");
			int n = scn.nextInt();
		//	System.out.println("Start feeding the array");
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			return arr;
		}

		public static int maxcirclesum(int arr[]) {
			int sum[] = new int[arr.length];
			int s = 0, pos = 0, max = 0;

			for (int i = 0; i < arr.length; i++) {
				s += arr[i];
				sum[i] = s;
			}
			max = sum[0];
			for (int i = 0; i < arr.length; i++) {
				if (max < sum[i]) {
					max = sum[i];
					pos = i;
				}
			}
			return max;
		}

		public static void rotate(int[] arr, int rot) {
	//System.out.println();
			rot = rot % arr.length;

			if (rot < 0) {
				rot = rot + arr.length;
			}

			for (int r = 1; r <= rot; r++) {

				int temp = arr[arr.length - 1];

				for (int i = arr.length - 1; i >= 1; i--) {
					arr[i] = arr[i - 1];
				}

				arr[0] = temp;

			}

//			for(int i=0;i<arr.length;i++)
//				System.out.print(arr[i]+" ");
		}

	
	

}
