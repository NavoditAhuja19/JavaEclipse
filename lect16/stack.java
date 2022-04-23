package lect16;

import java.util.Arrays;

public class stack {
	protected int[] data;
	protected int tos;

	public stack() {
		data = new int[5];
		tos = -1;
	}

	public stack(int cap) {
		data = new int[cap];
		tos = -1;
	}

	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("stack is full");
		}
		tos++;
		data[tos] = item;

	}

	public int pop() throws Exception {
		if (isempty()) {
			throw new Exception("stack is empty");
		}
		int temp = data[tos];

		data[tos] = 0;
		tos--;

		return temp;

	}

	public int peek() throws Exception {
		if (isempty()) {
			throw new Exception("stack is empty");
		}
		int temp = data[tos];

		return temp;

	}

	public int size() {
		return tos + 1;
	}

	public boolean isempty() {
		return size() == 0;
	}

	public boolean isfull() {
		return size() == data.length;
	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(data[i] + " ");
		}
		//System.out.println();
	}
	public void sortstack() {
		
		int[] arr=new int[tos+1];
		for(int i=0;i<=tos;i++) {
			arr[i]=data[i];
		}
		Arrays.sort(arr);
		data=arr;
			
	}

}
