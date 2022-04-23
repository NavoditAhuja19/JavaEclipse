package lect25;

public class trieclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie=new Trie();
		trie.addword("art");
		trie.addword("arts");
		trie.addword("amit");
		trie.addword("boy");
		trie.addword("sea");
		trie.display();
		System.out.println(trie.search("art"));

		System.out.println(trie.search("abc"));
	}

}
