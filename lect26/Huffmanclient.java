package lect26;

public class Huffmanclient {
	public static void main(String[] args) {

		String str = "aaabbaccadbbaaa";
		HuffmanEncoder encoder = new HuffmanEncoder(str);
		String codedstring = encoder.encode(str);
		System.out.println(codedstring);
	}
}
