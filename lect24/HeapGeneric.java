package lect24;

import java.util.ArrayList;
import java.util.HashMap;

public class HeapGeneric<T extends Comparable<T>> {
	ArrayList<T> data = new ArrayList<>();

	HashMap<T, Integer> map = new HashMap<>();

	public void add(T item) {
		data.add(item);
		map.put(item, data.size() - 1);
		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) {

		int pi = (ci - 1) / 2;
		if (islarger(data.get(ci), data.get(pi)) > 0) {
			swap(ci, pi);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {

		T ith = data.get(i);
		T jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
		map.put(ith, j);
		map.put(jth, i);

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

	public T remove() {
		swap(0, data.size() - 1);

		T rv = data.remove(data.size() - 1);
		downheapify(0);

		return rv;
	}

	private void downheapify(int pi) {
		int lci = (pi * 2) + 1;
		int rci = (pi * 2) + 2;
		int mini = pi;
		if (lci < data.size() && islarger(data.get(lci), data.get(mini)) > 0) {
			mini = lci;
		}
		if (rci < data.size() && islarger(data.get(rci), data.get(mini)) > 0) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	public T get() {
		return data.get(0);
	}

	// function to tell higher priority
	public int islarger(T t, T o) {
		return t.compareTo(o);
	}
	public void updatepriority(T pair) {
		int idx=map.get(pair);
		upheapify(idx);
	}
}
