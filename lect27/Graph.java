package lect27;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import lect24.HeapGeneric;

public class Graph {
	HashMap<String, vertex> vtcies;

	private class vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();

	}

	public Graph() {
		vtcies = new HashMap<>();
	}

	public int numVertex() {
		return this.vtcies.size();
	}

	public void addVertex(String vname) {
		vertex vtx = new vertex();
		vtcies.put(vname, vtx);

	}

	public boolean containsVertex(String vname) {
		return this.vtcies.containsKey(vname);
	}

	public void removeVertex(String vname) {
		vertex vtx = vtcies.get(vname);
		ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
		for (String key : keys) {
			vertex nbrvtx = vtcies.get(key);
			nbrvtx.nbrs.remove(vname);
		}
		vtcies.remove(vname);
	}

	public int numEdges() {
		ArrayList<String> keys = new ArrayList<>(this.vtcies.keySet());
		int count = 0;
		for (String key : keys) {
			vertex vtx = vtcies.get(key);
			count += vtx.nbrs.size();
		}

		return count / 2;
	}

	public boolean containsEdge(String vname1, String vname2) {
		vertex vtx1 = vtcies.get(vname1);
		vertex vtx2 = vtcies.get(vname2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;

	}

	public void addEdge(String vname1, String vname2, int cost) {
		vertex vtx1 = vtcies.get(vname1);
		vertex vtx2 = vtcies.get(vname2);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);

	}

	public void removeEdge(String vname1, String vname2) {
		vertex vtx1 = vtcies.get(vname1);
		vertex vtx2 = vtcies.get(vname2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);

	}

	public void display() {
		ArrayList<String> keys = new ArrayList<>(this.vtcies.keySet());
		for (String key : keys) {
			vertex vtx = vtcies.get(key);
			System.out.println(key + "-->" + vtx.nbrs);
		}
	}

	public boolean haspath(String vname1, String vname2, HashMap<String, Boolean> processed) {
		processed.put(vname1, true);
		if (containsEdge(vname1, vname2)) {
			return true;
		}
		vertex vtx = vtcies.get(vname1);
		ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
		for (String nbr : nbrs) {
			if (!processed.containsKey(nbr) && haspath(nbr, vname2, processed)) {
				return true;
			}
		}
		return false;
	}

	private class pair {
		String vname;
		String psf;
	}

	public boolean bfs(String src, String dst) {
		LinkedList<pair> queue = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();
		pair sp = new pair();
		sp.vname = src;
		sp.psf = src;
		queue.addFirst(sp);
		while (!queue.isEmpty()) {
			pair rp = queue.removeLast();
			if (processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}
			vertex rpvtx = vtcies.get(rp.vname);
			ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
			for (String nbr : nbrs) {
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					queue.addFirst(np);
				}
			}

		}
		return false;
	}

	public boolean dfs(String src, String dst) {
		LinkedList<pair> stack = new LinkedList<>();
		HashMap<String, Boolean> processed = new HashMap<>();
		pair sp = new pair();
		sp.vname = src;
		sp.psf = src;
		stack.addFirst(sp);
		while (!stack.isEmpty()) {
			pair rp = stack.removeFirst();
			if (processed.containsKey(rp.vname)) {
				continue;
			}
			processed.put(rp.vname, true);
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}
			vertex rpvtx = vtcies.get(rp.vname);
			ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
			for (String nbr : nbrs) {
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					stack.addFirst(np);
				}

			}

		}
		return false;
	}

	public void bft() {
		LinkedList<pair> queue = new LinkedList<>();
		ArrayList<String> keys = new ArrayList<>(vtcies.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : keys) {
			if (processed.containsKey(key)) {
				continue;
			}
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			queue.addFirst(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeLast();
				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);
				System.out.println(rp.vname + "-->" + rp.psf);
				vertex rpvtx = vtcies.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						pair np = new pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						queue.addFirst(np);
					}

				}

			}
		}

	}

	public void dft() {
		LinkedList<pair> stack = new LinkedList<>();
		ArrayList<String> keys = new ArrayList<>(vtcies.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : keys) {
			if (processed.containsKey(key)) {
				continue;
			}
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			stack.addFirst(sp);
			while (!stack.isEmpty()) {
				pair rp = stack.removeFirst();
				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);
				System.out.println(rp.vname + "-->" + rp.psf);
				vertex rpvtx = vtcies.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						pair np = new pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						stack.addFirst(np);
					}

				}

			}
		}

	}

	public boolean iscyclic() {
		LinkedList<pair> queue = new LinkedList<>();
		ArrayList<String> keys = new ArrayList<>(vtcies.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : keys) {
			if (processed.containsKey(key)) {
				continue;
			}
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			queue.addFirst(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeLast();
				if (processed.containsKey(rp.vname)) {
					return true;
				}
				processed.put(rp.vname, true);

				vertex rpvtx = vtcies.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						pair np = new pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						queue.addFirst(np);
					}

				}

			}
		}
		return false;

	}

	public boolean isconnected() {
		LinkedList<pair> queue = new LinkedList<>();
		int flag = 0;
		ArrayList<String> keys = new ArrayList<>(vtcies.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();
		for (String key : keys) {
			if (processed.containsKey(key)) {

				continue;
			}
			flag++;
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			queue.addFirst(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeLast();
				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);

				vertex rpvtx = vtcies.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						pair np = new pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						queue.addFirst(np);
					}

				}

			}
		}

		if (flag >= 2) {
			return false;
		} else {
			return true;
		}
	}

	public boolean istree() {
		return !iscyclic() && isconnected();
	}

	public ArrayList<ArrayList<String>> getcc() {
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		LinkedList<pair> queue = new LinkedList<>();
		ArrayList<String> keys = new ArrayList<>(vtcies.keySet());
		HashMap<String, Boolean> processed = new HashMap<>();

		for (String key : keys) {
			if (processed.containsKey(key)) {
				continue;
			}
			ArrayList<String> subans = new ArrayList<>();
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			queue.addFirst(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeLast();
				if (processed.containsKey(rp.vname)) {
					continue;
				}
				processed.put(rp.vname, true);
				subans.add(rp.vname);
				vertex rpvtx = vtcies.get(rp.vname);
				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						pair np = new pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						queue.addFirst(np);
					}

				}

			}
			ans.add(subans);
		}
		return ans;

	}

	private class primspair implements Comparable<primspair> {
		String vname;
		String acqvname;
		int cost;

		@Override
		public int compareTo(primspair o) {

			return o.cost - this.cost;
		}
	}

	public Graph prims() {
		Graph mst = new Graph();
		HashMap<String, primspair> map = new HashMap<>();
		HeapGeneric<primspair> heap = new HeapGeneric<>();
		for (String vname : vtcies.keySet()) {
			primspair pp = new primspair();
			pp.vname = vname;
			pp.acqvname = null;
			pp.cost = Integer.MAX_VALUE;

			map.put(vname, pp);
			heap.add(pp);
		}
		while (!heap.isEmpty()) {
			primspair rp = heap.remove();
			if (!map.containsKey(rp.vname)) {
				continue;
			}
			map.remove(rp.vname);
			if (rp.acqvname == null) {
				mst.addVertex(rp.vname);
			} else {
				mst.addVertex(rp.vname);
				mst.addEdge(rp.vname, rp.acqvname, rp.cost);

			}
			for (String nbr : vtcies.get(rp.vname).nbrs.keySet()) {
				if (map.containsKey(nbr)) {
					int oc = map.get(nbr).cost;
					int nc = vtcies.get(rp.vname).nbrs.get(nbr);
					if (nc < oc) {
						primspair gp = map.get(nbr);

						gp.acqvname = rp.vname;
						gp.cost = nc;
						heap.updatepriority(gp);
					}
				}
			}

		}

		return mst;

	}

	private class DijkstraPair implements Comparable<DijkstraPair> {
		String vname;
		String psf;
		int cost;

		@Override
		public int compareTo(DijkstraPair o) {

			return o.cost - this.cost;
		}
	}

	public HashMap<String, Integer> Dijkstra(String src) {

		HashMap<String, Integer> ans = new HashMap<>();
		HashMap<String, DijkstraPair> map = new HashMap<>();
		HeapGeneric<DijkstraPair> heap = new HeapGeneric<>();
		for (String vname : vtcies.keySet()) {
			DijkstraPair np = new DijkstraPair();
			if (vname.equals(src)) {
				np.vname = vname;
				np.psf = vname;
				np.cost = 0;
			} else {
				np.vname = vname;
				np.psf = "";
				np.cost = 10000;
			}
			map.put(vname, np);
			heap.add(np);
		}
		while (!heap.isEmpty()) {
			DijkstraPair rp = heap.remove();
			if (!map.containsKey(rp.vname)) {
				continue;
			}
			map.remove(rp.vname);
			ans.put(rp.vname, rp.cost);
			for (String nbr : vtcies.get(rp.vname).nbrs.keySet()) {
				if (map.containsKey(nbr)) {
					int oc = map.get(nbr).cost;
					int nc = rp.cost + vtcies.get(rp.vname).nbrs.get(nbr);
					if (nc < oc) {
						DijkstraPair gp = map.get(nbr);

						gp.psf = rp.psf + nbr;
						gp.cost = nc;
						heap.updatepriority(gp);
					}
				}
			}

		}

		return ans;

	}

	private class disjointset {
		private class Node {
			String data;
			int rank;
			Node parent;
		}

		HashMap<String, Node> map = new HashMap<>();

		public void create(String value) {
			Node nn = new Node();
			nn.data = value;
			nn.rank = 0;
			nn.parent = nn;
			map.put(value, nn);
		}

		public String find(String value) {
			return find(map.get(value)).data;
		}

		private Node find(Node node) {
			if (node.parent == node) {
				return node;
			}

			Node rr = find(node.parent);
			node.parent = rr;// path compresion

			return rr;
		}

		public void union(String value1, String value2) {
			String rep1 = find(value1);
			String rep2 = find(value2);
			if (rep1.equals(rep2)) {
				return;
			} else {
				Node n1 = map.get(value1);
				Node n2 = map.get(value2);
				if (n1.rank == n2.rank) {
					n2.parent = n1;
					n1.rank = n1.rank + 1;
				} else if (n1.rank > n2.rank) {
					n2.parent = n1;
				} else {
					n1.parent = n2;
				}

			}
		}

	}

	private class edgepair implements Comparable<edgepair> {
		String v1;
		String v2;
		int cost;

		@Override
		public int compareTo(edgepair o) {

			return this.cost - o.cost;
		}

		@Override
		public String toString() {
			return v1 + "-" + v2 + " : " + cost;
		}
	}

	public ArrayList<edgepair> alledges() {
		ArrayList<edgepair> edges = new ArrayList<>();
		for (String key : vtcies.keySet()) {
			vertex vtx = vtcies.get(key);
			for (String nbr : vtx.nbrs.keySet()) {
				edgepair ep = new edgepair();
				ep.v1 = key;
				ep.v2 = nbr;
				ep.cost = vtx.nbrs.get(nbr);
				edges.add(ep);

			}
		}
		return edges;
	}

	private void krushkal() {
		ArrayList<edgepair> edges = alledges();
		Collections.sort(edges);
		disjointset set = new disjointset();
		for (String vname : vtcies.keySet()) {
			set.create(vname);
		}
		for (edgepair edge : edges) {
			String rep1 = set.find(edge.v1);
			String rep2 = set.find(edge.v2);
			if (rep1.equals(rep2)) {
				continue;
			} else {
				System.out.println(edge);
				set.union(edge.v1, edge.v2);
			}
		}
	}

}
