package algorithms;

import java.util.Scanner;

public class shopping_game {

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
		int a=1;
		int b=2;
		int suma=0,sumb=0;
	
		while(suma<=ma&&sumb<=nh)
		{
			suma+=a;
			
			a=a+2;
			sumb+=b;
			b=b+2;
		}
		if(suma<ma)
			return 1;
		return 0;
			
	}

}
