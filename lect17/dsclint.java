package lect17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

import lect16.stack;

public class dsclint {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		stack ds = new dynamic_stack();
//		ds.push(110);
//		ds.push(02);
//		ds.push(30);
//		ds.push(07);
//		ds.push(540);
//		ds.push(60);
////		ds.display();
//		// ds.pop();
//		// ds.pop();
//		ds.display();
//		ds.sortstack();
//		ds.display();
////		displayreverse(ds);
////		System.out.println();
////		ds.display();
//		// actualreverese(ds, new stack());
//		// ds.display();
//		int[] arr = { 11, 9, 13, 21, 3 };
//
//		nextgreatestelement2(arr);
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int Q = scn.nextInt();
		int[] prime = giveprime(Q);

		stack[] A = new dynamic_stack[Q + 1];
		stack[] B = new dynamic_stack[Q + 1];
		A[0] = new dynamic_stack();
		for (int i = 0; i < N; i++) {
			A[0].push(scn.nextInt());
		}
		// A[0].display();
		for (int i = 1; i < Q + 1; i++) {
			A[i] = new dynamic_stack();
			B[i] = new dynamic_stack();
			while (!A[i - 1].isempty()) {
				int num = A[i - 1].pop();

				if (num % prime[i] == 0) {
					B[i].push(num);

				} else {
					A[i].push(num);
				}
			}
		}
		for (int i = 1; i <= Q; i++) {
			B[i].display();
		}
		A[Q].display();
	}

	public static int[] giveprime(int n) {

		int prime[] = new int[n + 1];
		int i = 2;
		int cnt = 1;
		while (true) {
			if (checkprime(i)) {
				prime[cnt] = i;
				cnt++;
			}
			i++;
			if (cnt == prime.length) {
				break;
			}
		}
		return prime;

	}

	public static boolean checkprime(int n) {

		int a = 2;
		int flag = 0;
		while (a < n) {
			if (n % a == 0) {
				flag = 1;
			}

			a = a + 1;

		}
		if (flag == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void displayreverse(stack s) throws Exception {
		if (s.isempty()) {
			return;
		}
		int temp = s.pop();
		displayreverse(s);
		System.out.print(temp + " ");
		s.push(temp);
	}

	public static void actualreverese(stack s, stack other) throws Exception {
		if (s.isempty()) {
			// actualreveresehelper(s, other);
			if (other.isempty()) {
				return;
			}
			int temp = other.pop();
			actualreverese(s, other);
			s.push(temp);

			return;
		}
		int temp = s.pop();
		other.push(temp);
		actualreverese(s, other);

	}

	public static void actualreveresehelper(stack s, stack other) throws Exception {
		if (other.isempty()) {
			return;
		}
		int temp = other.pop();
		actualreveresehelper(s, other);
		s.push(temp);
	}

	public static void nextgreatestelement(int[] arr) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && s.peek() < arr[i]) {
				System.out.println(s.pop() + "-->" + arr[i]);
			}
			s.push(arr[i]);

		}
		while (!s.isEmpty()) {
			System.out.println(s.pop() + "-->" + "-1");
		}
	}

	public static void nextgreatestelement2(int[] arr) throws Exception {
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && s.peek() < arr[i]) {
				System.out.println(s.pop() + "," + arr[i]);
			}
			s.push(arr[i]);
			s = Stacksort(s);

		}
		while (!s.isEmpty()) {
			System.out.println(s.pop() + "," + "-1");
		}
	}

	public static Stack<Integer> Stacksort(Stack<Integer> s) {
		int[] arr = new int[s.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) s.pop();
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			s.push(arr[i]);
		}
		return s;
	}

}
