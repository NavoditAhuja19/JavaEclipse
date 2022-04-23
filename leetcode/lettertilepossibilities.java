package leetcode;

public class lettertilepossibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numTilePossibilities("AAB"));
	}



	public static int numTilePossibilities(String tiles) {
		int[] freq = new int[27];
		char[] ch = tiles.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			freq[(int) (ch[i] - 'A') + 1]++;

		}
		 int count = 0;
		//count=numTilePossibilities(freq, count);
		count=numTilePossibilities(freq, count,"");

		return count;
	}





	private static int numTilePossibilities(int[] freq,int count) {
			
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
			
			freq[i]--;
			count=numTilePossibilities(freq,count+1);
			freq[i]++;
			}
			
			
		}
		return count;
	}
	private static int numTilePossibilities(int[] freq, int count, String str) {
		for(int i=1;i<freq.length;i++) {
			if(freq[i]>0) {
			//str=str+(char)((i+'A')-1);
			System.out.println(str+(char)((i+'A')-1));
			freq[i]--;
			count=numTilePossibilities(freq,count+1,str+(char)((i+'A')-1));
			freq[i]++;
			}
			
			
		}
		return count;
	}

}
