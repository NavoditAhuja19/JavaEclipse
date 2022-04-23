package lect24;

public class heapclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap heap = new MaxHeap();
		System.out.println(heap.size());
		heap.add(10);
		heap.add(20);
		heap.add(30);
		heap.add(15);
		heap.display();

		heap.add(5);
		heap.add(3);
		heap.display();
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		heap.display();

	}

}
