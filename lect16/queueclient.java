package lect16;

public class queueclient {
	public static void main(String[] args) {
		queue q = new queue();
		try {
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.enqueue(40);
			q.enqueue(50);
			q.display();
			System.out.println(q.dequeue());

			System.out.println(q.dequeue());
			q.enqueue(60);
			q.enqueue(70);
			q.display();
		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
