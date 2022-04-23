package lec7;

import java.util.Scanner;

public class substring2 {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		substring(str);

	}

	public static void substring(String a) {
		String s2;
		for (int k = 0; k <= a.length() - 1; k++) {
			for (int i = k+1; i <= a.length() ; i++) {
				s2=a.substring(k,i);
				System.out.println(s2);
			

				}
		
			}

		}
	}


