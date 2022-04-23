package lect16;

public class stackclient {
	public static void main(String[] args) throws Exception {
		stack s = new stack();
		s.push(40);
		s.push(30);
		s.push(20);
		s.push(10);
		s.push(5);
		s.push(8);
		s.display();

		System.out.println(s.peek());
		s.pop();

		s.display();

	}

}
