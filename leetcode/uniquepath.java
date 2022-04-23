package leetcode;

public class uniquepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(uniquePaths(7, 3));
	}
	 public static int uniquePaths(int m, int n) {
	      return uptd(m-1, n-1, 0,0, new int[m][n]);
		 //return uniquePaths(m-1, n-1,0,0);
	    }
	private static int uniquePaths(int m, int n, int row, int col) {
	
		if(row==m&&col==n) {
			return 1;
		}
		if(row>m||col>n) {
			return 0;
		}
		
		int count=0;
	
		count+=uniquePaths(m, n, row, col+1);//right
		count+=uniquePaths(m, n, row+1, col);//down
		
		return count;
	}
	private static int uptd(int m, int n, int row, int col,int[][] strg) {
		
		if(row==m&&col==n) {
			return 1;
		}
		if(row>m||col>n) {
			return 0;
		}
		if(strg[row][col]!=0) {
			return strg[row][col];
		}
		
		
		int count=0;
	
		count+=uptd(m, n, row, col+1,strg);//right
		count+=uptd(m, n, row+1, col,strg);//down
		strg[row][col]=count;
		return count;
	}

}
