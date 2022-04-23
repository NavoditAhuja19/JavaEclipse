package leetcode;

import java.util.Scanner;

public class binarystrings {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++) {
			int n=scn.nextInt();
			//System.out.println(numberofstrings(n, false));
			System.out.println(numberofstringsTD(n, false,new int[n],new int[n+1]));
		}
	}

	public static int numberofstrings(int n,boolean lastone) {
		if(n==0) {
			return 1;
		}
		int sum=0;
		if(!lastone) {
			sum+=numberofstrings(n-1, false);//zero
			sum+=numberofstrings(n-1, true);//one
		}else {
			sum+=numberofstrings(n-1, false);//zero
		}
		return sum;
	}
	public static int numberofstringsTD(int n,boolean lastone,int[] strgone,int[] strgzero) {
		if(n==0) {
			return 1;
		}
		
		int sum=0;
		if(!lastone) {
			if(strgzero[n]!=0) {
				return strgzero[n];
			}
			sum+=numberofstringsTD(n-1, false,strgone,strgzero);//zero
			sum+=numberofstringsTD(n-1, true,strgone,strgzero);//one
			strgzero[n]=sum;
			
		}else {
			if(strgone[n]!=0) {
				return strgone[n];
			}
			sum+=numberofstringsTD(n-1, false,strgone,strgzero);//zero
			strgone[n]=sum;
		}
				return sum;
	}
	
}
