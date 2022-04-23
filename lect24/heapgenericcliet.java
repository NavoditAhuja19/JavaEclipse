package lect24;

import lect23.car;

public class heapgenericcliet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car[] cars = new car[5];
		cars[0] = new car(1000, 2000, "red");
		cars[1] = new car(200, 500, "blue");
		cars[2] = new car(3000, 10, "green");
		cars[3] = new car(10, 3000, "orange");
		cars[4] = new car(500, 400, "black");
		HeapGeneric<car> heap=new HeapGeneric<>();
		heap.add(cars[0]);
		heap.add(cars[1]);
		heap.add(cars[2]);
		heap.add(cars[3]);
		heap.add(cars[4]);
		heap.display();
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		

	}

}
