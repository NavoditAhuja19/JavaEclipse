package leetcode;

import java.util.ArrayList;

public class KthLargest {
	static MinHeap heap = new MinHeap();

	public KthLargest(int k, int[] nums) {

		for (int i = 0; i < k&&i<nums.length; i++) {
			heap.add(nums[i]);

		}
		
		for(int i=k;i<nums.length;i++) {
			int small=heap.get();
			if(small<nums[i]) {
				heap.remove();
				heap.add(nums[i]);
			}
		}
		a = k;
	}

	public static int a = 0;

	public static int add(int val) {

		heap.add(val);
		int kth = 0;

		int size = heap.size();
		int etbf = size - a + 1;
		int[] rv = new int[etbf - 1];
		for (int i = 1; i < etbf; i++) {

			rv[i - 1] = heap.remove();
		}

		kth = heap.get();
		for (int i = 1; i < etbf; i++) {
			heap.add(rv[i - 1]);
		}

		return kth;

	}

}

class MinHeap {
	ArrayList<Integer> data = new ArrayList<>();

	public void add(int item) {
		data.add(item);
		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) {

		int pi = (ci - 1) / 2;
		if (data.get(ci) < data.get(pi)) {
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
		int mini = pi;
		if (lci < data.size() && data.get(lci) < data.get(mini)) {
			mini = lci;
		}
		if (rci < data.size() && data.get(rci) < data.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	public int get() {
		return data.get(0);
	}

}

class MaxHeap {
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
