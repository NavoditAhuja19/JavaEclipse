package lect17;

import lect16.queue;

public class dynamic_queue extends queue {
	@Override
	public void enqueue(int item) throws Exception {
		if (isfull()) {
			int na[] = new int[2 * data.length];
			int cnt = 0;
			for (int i = front; i < front + size; i++) {
				na[cnt++] = data[i % data.length];

			}
			front = 0;
			data = na;
		}
		super.enqueue(item);
	}

}
