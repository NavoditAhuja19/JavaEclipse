package lect16;

public class queue {
	protected int[] data;
	protected int front, size;

	public queue() {
		data = new int[5];
		front = 0;
		size = 0;

	}

	public queue(int cap) {
		data = new int[cap];
		front = 0;
		size = 0;

	}

	public void enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("queue is full");
		}
		int idx = (front + size) % data.length;
		data[idx] = item;
		size++;
	}

	public int dequeue() throws Exception {
		if (isempty()) {
			throw new Exception("queue is empty");
		}
		int temp = data[front];
		data[front] = 0;
		front = (front + 1) % data.length;
		size--;
		return temp;
	}

	public int getfront() throws Exception {
		if (isempty()) {
			throw new Exception("queue is empty");
		}
		int temp = data[front];
		return temp;
	}

	public int size() {
		return size;
	}

	public boolean isempty() {
		return size == 0;
	}

	public boolean isfull() {
		return size == data.length;
	}

	public void display() {
		for (int i = front; i < front + size; i++) {
			
			System.out.print(data[i%data.length]+" ");
		}
		System.out.println();

	}

}
