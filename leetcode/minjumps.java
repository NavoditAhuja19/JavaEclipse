package leetcode;

import java.util.Scanner;

public class minjumps {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int t=scn.nextInt();
	for(int i=0;i<t;i++) {
		int size=scn.nextInt();
		int[] arr=new int[size];
		for(int j=0;j<size;j++) {
			arr[j]=scn.nextInt();
		}
		System.out.println(minnumberjumps(arr, 0,new int[arr.length]));
		
	}
		
	}
	public static int minnumberjumps(int[] arr,int idx,int[] strg){
		if(idx>=arr.length) {
			return 0;
		}
		if(strg[idx]!=0) {
			return strg[idx];
		}
		if(arr[idx]==0) {
			return Integer.MAX_VALUE;
		}
		int min=Integer.MAX_VALUE;
		int n=arr[idx];
		for(int i=n;i>0;i--) {
			int ans=minnumberjumps(arr, idx+n,strg);
			if(ans<min) {
				min=ans+1;
			}
		}
		strg[idx]=min;
		return min;
		
	}

}
