package lect19;

import lect17.dynamic_queue;

public class SUQpopefficient {
	dynamic_queue pq = new dynamic_queue();

	public void push(int item) throws Exception {

		try {
			dynamic_queue hq = new dynamic_queue();
			hq.enqueue(item);
			while (pq.size() != 0) {
				hq.enqueue(pq.dequeue());
			}
			pq = hq;
		} catch (Exception e) {
			throw new Exception("Stack is full");
		}
	}

	public int pop() throws Exception {
		try {
			return pq.dequeue();
		} catch (Exception e) {
			throw new Exception("stack is empty");
		}
	}

	public int peek() throws Exception {
		try {
			return pq.getfront();
		} catch (Exception e) {
			throw new Exception("stack is empty");
		}
	}

	public boolean isempty() {
		return pq.isempty();
	}

	public boolean isfull() {
		return pq.isfull();
	}

	public void display() {
		pq.display();
	}

}
