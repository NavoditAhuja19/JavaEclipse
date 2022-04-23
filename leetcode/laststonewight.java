package leetcode;

import java.util.ArrayList;

public class laststonewight {

	public int lastStoneWeight(int[] stones) {
		MaxHeap heap = new MaxHeap();
		for (int i = 0; i < stones.length; i++) {
			heap.add(stones[i]);
		}
		while (heap.size() > 1) {
			int st1 = heap.remove();
			int st2 = heap.remove();
			if (st1 > st2) {

				heap.add(st1 - st2);
			}
		}
		if (heap.size() == 0) {

			return 0;
		} else {
			return heap.get();
		}
	}

}
