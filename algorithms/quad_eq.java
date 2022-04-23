package algorithms;

import java.util.Scanner;

public class quad_eq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d;
		d=(b*b)-4*a*c;
		int e,f,g;
		if(d==0)
		{
			System.out.println("Real and Equal");
			 e=-b/2*a;
			 System.out.println(e+" "+e);
			
		}
		else if(d>=0)
		{
			System.out.println("Real and Distinct");
		     g=(int)Math.sqrt(d);
			 e=(-b+g)/(2*a);
			 f=(-b-g)/(2*a);
			 if(e<f)
			 System.out.println(e+" "+f);
			 else
				 System.out.println(f+" "+e);
			
		}
		else
		{
			System.out.println("Imaginary");
		}
	}

}
