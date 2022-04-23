package algorithms;

import java.util.Scanner;

public class checkoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		while (ch != 'X' || ch != 'x') {

			if (ch == '+')

			{
				int a = scn.nextInt();
				int b = scn.nextInt();
				int c = a + b;
				System.out.println(c);

			} else if (ch == '-')

			{
				int a = scn.nextInt();
				int b = scn.nextInt();
				int c = a - b;
				System.out.println(c);

			} else if (ch == '*')

			{
				int a = scn.nextInt();
				int b = scn.nextInt();
				int c = a * b;
				System.out.println(c);

			} else if (ch == '/')

			{
				int a = scn.nextInt();
				int b = scn.nextInt();
				int c = a / b;
				System.out.println(c);

			} else if (ch == '%')

			{
				int a = scn.nextInt();
				int b = scn.nextInt();
				int c = a % b;
				System.out.println(c);

			}else if (ch == 'X'||ch=='x')
			{
				break;
			}
			else {
				System.out.println("Invalid operation. Try again.");
			}
			ch = scn.next().charAt(0);

		}

	}

}
