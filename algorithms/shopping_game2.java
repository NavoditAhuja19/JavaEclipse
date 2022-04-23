package algorithms;

import java.util.Scanner;

public class shopping_game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int[] arr=new int[t];
		
		for(int i=0;i<t;i++)
		{
			int ma = scn.nextInt();
			int nh = scn.nextInt();
			arr[i]=shopping(ma,nh);
		}
		for(int i=0;i<t;i++)
		{
			if(arr[i]==1)
				System.out.println("Aayush");
			else
				System.out.println("Harshit");
		}
	}
	public static int shopping(int ma,int nh)
	{
		
		int suma = 0;
		int sumh = 0;

		int cnt = 1;

		while (true) {
			suma += cnt;
			cnt++;
			sumh += cnt;
			cnt++;

			if (suma > ma) {
				return 1;
				
			}
			if (sumh > nh) {
				return 0;
				
			}

		}

	}


}
