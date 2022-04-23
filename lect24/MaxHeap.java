package lect24;

import java.util.ArrayList;

public class MaxHeap {
	ArrayList<Integer> data = new ArrayList<>();

	public void add(int item) {
		data.add(item);
		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) {

		int pi = (ci - 1) / 2;
		if (data.get(ci) > data.get(pi)) {
			swap(ci, pi);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {

		int ith = data.get(i);
		int jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);

	}

	public void display() {
		System.out.println(data);
	}

	public int size() {
		return data.size();
	}

	public boolean isEmpty() {
		return data.size() == 0;
	}

	public int remove() {
		swap(0, data.size() - 1);

		int rv = data.remove(data.size() - 1);
		downheapify(0);

		return rv;
	}

	private void downheapify(int pi) {
		int lci = (pi * 2) + 1;
		int rci = (pi * 2) + 2;
		int maxi = pi;
		if (lci < data.size() && data.get(lci) > data.get(maxi)) {
			maxi = lci;
		}
		if (rci < data.size() && data.get(rci) > data.get(maxi)) {
			maxi = rci;
		}
		if (maxi != pi) {
			swap(maxi, pi);
			downheapify(maxi);
		}

	}

	public int get() {
		return data.get(0);
	}

}
