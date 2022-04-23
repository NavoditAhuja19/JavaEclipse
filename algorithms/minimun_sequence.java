package algorithms;

import java.util.Scanner;

public class minimun_sequence {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=scn.nextInt();

	
	for(int i=0;i<t;i++)
	{
		String str = scn.next();
		min(str);
	}
	}

	public static void min(String str) {
		int[] arr = new int[str.length() + 1];
		int num = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I')
				
			{
				arr[i] = num++;
				for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
					arr[j] = num++;

				}

			}
		}
		int rev=0;
		for (int i = 0; i < arr.length; i++) {
		//	System.out.print(arr[i]);
			rev=rev*10+arr[i];
		}
		System.out.println(rev);
	}

}
