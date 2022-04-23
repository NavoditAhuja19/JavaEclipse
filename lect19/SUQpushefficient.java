package lect19;

import lect17.dynamic_queue;

public class SUQpushefficient {
	dynamic_queue pq = new dynamic_queue();

	public void push(int item) throws Exception {
		try {
			pq.enqueue(item);
		} catch (Exception e) {
			throw new Exception("stack is full");
		}
	}

	public int pop() throws Exception {
		dynamic_queue hq = new dynamic_queue();
		try {
			while (pq.size() != 1) {
				hq.enqueue(pq.dequeue());
			}
			int temp = pq.dequeue();
			pq = hq;
			return temp;
		} catch (Exception e) {

			throw new Exception("stack is empty");

		}
	}

	public int peek() throws Exception {
		dynamic_queue hq = new dynamic_queue();
		try {
			while (pq.size() != 1) {
				hq.enqueue(pq.dequeue());
			}
			int temp = pq.dequeue();
			hq.enqueue(temp);
			pq = hq;
			return temp;
		} catch (Exception e) {

			throw new Exception("stack is empty");

		}
	}

	public int size() {
		return pq.size();
	}

	public boolean isempty() {
		return pq.isempty();
	}

	public boolean isfull() {
		return pq.isfull();
	}

	public void display() throws Exception {
		display(0);
		System.out.println("\n------------------------");
	}

	private void display(int count) throws Exception {
		if (count == pq.size()) {
			return;

		}try {
		int temp = pq.dequeue();
		pq.enqueue(temp);
		display(count+1);
		System.out.print(temp+" ");
		}
		catch(Exception e) {
			throw new Exception("error in display");
		}
	}

}
