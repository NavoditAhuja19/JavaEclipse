package lect19;

import lect17.dynamic_stack;

public class QUSdeqefficient2 {
	dynamic_stack ps = new dynamic_stack();

	public void enqueue(int item) throws Exception {
		try {
			dynamic_stack hs = new dynamic_stack();
			while (ps.size() != 0) {
				hs.push(ps.pop());
			}
			ps.push(item);
			// hs.push(item);
			while (hs.size() != 0) {
				ps.push(hs.pop());
			}
		} catch (Exception e) {
			throw new Exception("queue is full");

		}
	}

	public int dequeue() throws Exception {
		try {

			return ps.pop();
		} catch (Exception e) {
			throw new Exception("queue is empty");
		}
	}

	public int getfront() throws Exception {
		try {
			return ps.peek();
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
			ps.display();

		} catch (Exception e) {
			throw new Exception("error in display");
		}
	}

}
