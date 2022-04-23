package leetcode;

public class longestincreasingsubsequence {
	public static void main(String[] args) {

		int[] arr= {50,3,10,7,40,80};
		System.out.println(lis(arr,0).count);
	}

	public static class pair{
		int count;
		int smallestnum;
	}
	public static pair lis(int[] arr, int vidx) {
		if (vidx == arr.length - 1) {
			pair np=new pair();
			np.count=1;
			np.smallestnum=arr[arr.length-1];
			return np;
		}
		int curr = arr[vidx];
		pair part = lis(arr, vidx + 1);
		
		
		
		if (part.smallestnum > curr) {
			part.count = part.count + 1;
			part.smallestnum=curr;
		}

		return part;
	}
}
