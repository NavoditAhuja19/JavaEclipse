package lect27;

import java.util.HashMap;

public class graphclient {
	public static void main(String[] args) {
		Graph gh = new Graph();
		gh.addVertex("A");
		gh.addVertex("B");
		gh.addVertex("C");
		gh.addVertex("D");
		gh.addVertex("E");
		gh.addVertex("F");
		gh.addVertex("G");
		gh.addEdge("A", "B", 5);
		gh.addEdge("A", "D", 15);
		gh.addEdge("C", "B", 3);
		gh.addEdge("C", "D", 4);
		gh.addEdge("D", "E", 10);
		gh.addEdge("E", "F", 9);
		gh.addEdge("E", "G", 7);
		gh.addEdge("F", "G", 25);

		// gh.addVertex("X");
		// gh.removeEdge("D", "E");
		// gh.removeEdge("B", "C");
		// gh.removeEdge("G", "F");
		gh.display();
		// System.out.println(gh.containsEdge("A", "C"));
		// System.out.println(gh.haspath("A", "G", new HashMap<>()));
		// gh.dfs("A", "G");
		// gh.bft();
		System.out.println(gh.getcc());
	}

}
