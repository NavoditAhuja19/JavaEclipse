package leetcode;

public class longestpalindromicsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindromeSubseq("abcdaab"));

	}
    public static int longestPalindromeSubseq(String s) {
    	int[][] strg=new int[s.length()][s.length()];
    	for(int i=0;i<strg.length;i++) {
    		for(int j=0;j<strg[0].length;j++) {
    			strg[i][j]=-1;
    		}
    	}
    	return lpsTD(s, 0, s.length()-1, strg);
    	//return lpsrec(s,0,s.length()-1);
        
    }
	private static int lpsrec(String s, int si, int ei) {
		if(si==ei) {
			return 1;
		}
		if(si>ei) {
			return 0;
		}
		int ans=0;
		if(s.charAt(si)==s.charAt(ei)) {
			ans=lpsrec(s, si+1, ei-1)+2; 
		}
		else {
			int rec1=lpsrec(s, si+1, ei);
			int rec2=lpsrec(s, si, ei-1); 
		
			ans=Math.max(rec1, rec2);
		}
		return ans;
	}
	private static int lpsTD(String s, int si, int ei,int[][] strg) {
		if(si==ei) {
			return 1;
		}
		if(si>ei) {
			return 0;
		}
		if(strg[si][ei]!=-1) {
			return strg[si][ei];
		}
		int ans=0;
		if(s.charAt(si)==s.charAt(ei)) {
			ans=lpsTD(s, si+1, ei-1,strg)+2; 
		}
		else {
			int rec1=lpsTD(s, si+1, ei,strg);
			int rec2=lpsTD(s, si, ei-1,strg); 
		
			ans=Math.max(rec1, rec2);
		}
		strg[si][ei]=ans;
		return ans;
	}

}
