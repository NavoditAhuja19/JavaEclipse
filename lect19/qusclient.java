package lect19;

public class qusclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QUSdeqefficient2 queue = new QUSdeqefficient2();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.dequeue();

		queue.display();
	}

}
