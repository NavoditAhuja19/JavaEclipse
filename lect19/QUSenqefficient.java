package lect19;

import lect17.dynamic_stack;

public class QUSenqefficient {
	dynamic_stack ps = new dynamic_stack();

	public void enqueue(int item) throws Exception {
		try {
			ps.push(item);
		} catch (Exception e) {
			throw new Exception("queue is full");

		}
	}

	public int dequeue() throws Exception {
		try {
			dynamic_stack hs = new dynamic_stack();

			while (ps.size() != 1) {
				hs.push(ps.pop());

			}
			int temp = ps.pop();
			while (hs.size() != 0) {
				ps.push(hs.pop());
			}
			return temp;
		} catch (Exception e) {
			throw new Exception("queue is empty");
		}
	}

	public int getfront() throws Exception {
		try {
			dynamic_stack hs = new dynamic_stack();

			while (ps.size() != 1) {
				hs.push(ps.pop());

			}
			int temp = ps.pop();
			hs.push(temp);

			while (hs.size() != 0) {
				ps.push(hs.pop());
			}
			return temp;
		} catch (Exception e) {
			throw new Exception("queue is empty");
		}
	}

	public boolean isempty() {
		return ps.isempty();
	}

	public int size() {
		return ps.size();
	}

	public boolean isfull() {
		return ps.isfull();
	}

	public void display() throws Exception {
		try {
			if (ps.size() == 0) {
				return;
			}
			int temp = ps.pop();
			display();
			System.out.print(temp+" ");
			ps.push(temp);

		} catch (Exception e) {
			throw new Exception("error in display");
		}
	}
	
}
