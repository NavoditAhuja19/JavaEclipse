package leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class lengthofmaxfibonacciseries {

	 public int lenLongestFibSubseq(int[] arr) {
		 ArrayList<Integer> ar=new ArrayList<>();
	     HashMap<Integer,Boolean> map=new HashMap<>();
	     for(int i=0;i<arr.length;i++) {
	    	 map.put(arr[i], true);
	     }
	     for(int i=0;i<arr.length;i++) {
	    	 for(int j=i+1;j<arr.length;j++) {
	    		 int a=arr[i];
	    		 int b=arr[j];
	    		 int c=a+b;
	    	 }
	     }
	     
		 return 0;   
	    }
}
