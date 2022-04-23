package lect17;

import java.util.Scanner;

import lect16.queue;

public class dqclint {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		queue dq = new dynamic_queue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.dequeue();
		dq.dequeue();
		dq.enqueue(60);
		dq.enqueue(70);
		dq.enqueue(80);

		dq.display();
		// System.out.println(dq.dequeue());
		// dq.display();

		// actualreverse(dq);
		// displayreverse(dq, 0);
		// dq.display();

		// hoodies();

	}

	public static void actualreverse(queue q) throws Exception {
		if (q.isempty()) {
			return;
		}
		int temp = q.dequeue();
		actualreverse(q);

		q.enqueue(temp);
	}

	public static void displayreverse(queue q, int cnt) throws Exception {
		if (cnt == q.size()) {
			return;
		}
		int temp = q.dequeue();

		q.enqueue(temp);
		displayreverse(q, cnt + 1);
		System.out.println(temp);

	}

	public static void hoodies() throws Exception {

		int n = scn.nextInt();
		queue X1 = new dynamic_queue();
		queue X2 = new dynamic_queue();
		queue X3 = new dynamic_queue();
		queue X4 = new dynamic_queue();
		queue Y1 = new dynamic_queue();
		queue Y2 = new dynamic_queue();
		queue Y3 = new dynamic_queue();
		queue Y4 = new dynamic_queue();
		queue finalqueue = new dynamic_queue();
		int lasteleofq = 0;
		int size1 = 0;
		int size2 = 0;
		int size3 = 0;
		int size4 = 0;
		int flag1 = 0;
		int flag2 = 0;
		int flag3 = 0;
		int flag4 = 0;

		for (int i = 1; i <= n; i++) {
			char ch = scn.next().charAt(0);

			if (ch == 'E') {
				int x = scn.nextInt();
				int y = scn.nextInt();
				if (x == 1) {
					X1.enqueue(x);
					Y1.enqueue(y);

					if (flag1 == 0) {
						finalqueue.enqueue(x);
						flag1 = 1;
					}
				}
				if (x == 2) {
					X2.enqueue(x);
					Y2.enqueue(y);

					if (flag2 == 0) {
						finalqueue.enqueue(x);
						flag2 = 1;
					}
				}
				if (x == 3) {
					X3.enqueue(x);
					Y3.enqueue(y);

					if (flag3 == 0) {
						finalqueue.enqueue(x);
						flag3 = 1;
					}
				}
				if (x == 4) {
					X4.enqueue(x);
					Y4.enqueue(y);

					if (flag4 == 0) {
						finalqueue.enqueue(x);
						flag4 = 1;
					}
				}

			}

			else if (ch == 'D') {
				int fq = finalqueue.getfront();

				if (lasteleofq == 1 && size1 != 0) {
					fq = lasteleofq;
				} else if (lasteleofq == 2 && size2 != 0) {
					fq = lasteleofq;
				} else if (lasteleofq == 3 && size3 != 0) {
					fq = lasteleofq;
				} else if (lasteleofq == 4 && size4 != 0) {
					fq = lasteleofq;
				} else {
					fq = finalqueue.dequeue();
				}

				if (fq == 1) {
					size1 = 0;

					System.out.println(X1.dequeue() + " " + Y1.dequeue());
					size1 = X1.size();
					if (size1 == 0) {
						flag1 = 0;
					}

				}
				if (fq == 2) {
					size2 = 0;

					System.out.println(X2.dequeue() + " " + Y2.dequeue());
					size2 = X2.size();
					if (size2 == 0) {
						flag2 = 0;
					}
				}
				if (fq == 3) {
					size3 = 0;

					System.out.println(X3.dequeue() + " " + Y3.dequeue());
					size3 = X3.size();
					if (size3 == 0) {
						flag3 = 0;
					}
				}
				if (fq == 4) {
					size4 = 0;

					System.out.println(X4.dequeue() + " " + Y4.dequeue());
					size4 = X4.size();

					if (size4 == 0) {
						flag4 = 0;
					}
				}

				lasteleofq = fq;

			}

		}

	}

}
//karam bhaiya sol for hoodies at coding block
//public class Main {
//    protected int[] data;
//    protected int front, size;
//    public Main() {
//        data = new int[5];
//        front = 0;
//        size = 0;
//    }
//    public Main(int cap) {
//        data = new int[cap];
//        front = 0;
//        size = 0;
//    }
//    public void enMain(int item) throws Exception {
//        if (isfull()) {
//            throw new Exception("Main is full");
//        }
//        int idx = (front + size) % data.length;
//        data[idx] = item;
//        size++;
//    }
//    public int deMain() throws Exception {
//        if (isempty()) {
//            throw new Exception("Main is empty");
//        }
//        int temp = data[front];
//        data[front] = 0;
//        front = (front + 1) % data.length;
//        size--;
//        return temp;
//    }
//    public int getfront() throws Exception {
//        if (isempty()) {
//            throw new Exception("Main is empty");
//        }
//        int temp = data[front];
//        return temp;
//    }
//    public int size() {
//        return size;
//    }
//    public boolean isempty() {
//        return size == 0;
//    }
//    public boolean isfull() {
//        return size == data.length;
//    }
//    public void display() {
//        for (int i = front; i < front + size; i++) {
//            System.out.print(data[i % data.length] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) throws Exception {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        Main X1 = new dynamic_Main();
//        Main X2 = new dynamic_Main();
//        Main X3 = new dynamic_Main();
//        Main X4 = new dynamic_Main();
//        Main Y1 = new dynamic_Main();
//        Main Y2 = new dynamic_Main();
//        Main Y3 = new dynamic_Main();
//        Main Y4 = new dynamic_Main();
//        Main finalMain = new dynamic_Main();
//        int lasteleofq = 0;
//        int size1 = 0;
//        int size2 = 0;
//        int size3 = 0;
//        int size4 = 0;
//        int flag1 = 0;
//        int flag2 = 0;
//        int flag3 = 0;
//        int flag4 = 0;
//        for (int i = 1; i <= n; i++) {
//            char ch = scn.next().charAt(0);
//            if (ch == 'E') {
//                int x = scn.nextInt();
//                int y = scn.nextInt();
//                if (x == 1) {
//                    X1.enMain(x);
//                    Y1.enMain(y);
//                    if (flag1 == 0) {
//                        finalMain.enMain(x);
//                        flag1 = 1;
//                    }
//                }
//                else if (x == 2) {
//                    X2.enMain(x);
//                    Y2.enMain(y);
//                    if (flag2 == 0) {
//                        finalMain.enMain(x);
//                        flag2 = 1;
//                    }
//                }
//                else if (x == 3) {
//                    X3.enMain(x);
//                    Y3.enMain(y);
//                    if (flag3 == 0) {
//                        finalMain.enMain(x);
//                        flag3 = 1;
//                    }
//                }
//                else if (x == 4) {
//                    X4.enMain(x);
//                    Y4.enMain(y);
//                    if (flag4 == 0) {
//                        finalMain.enMain(x);
//                        flag4 = 1;
//                    }
//                }
//            }
//            else if (ch == 'D') {
//                int fq = finalMain.getfront();
////                if (lasteleofq == 1 && size1 != 0) {
////                    
////                    fq = lasteleofq;
////                } else if (lasteleofq == 2 && size2 != 0) {
////                    fq = lasteleofq;
////                } else if (lasteleofq == 3 && size3 != 0) {
////                    fq = lasteleofq;
////                } else if (lasteleofq == 4 && size4 != 0) {
////                    fq = lasteleofq;
////                }
////                else {
////                    fq=finalMain.deMain();
////                }
//                if (fq == 1) {
//                    
//                    System.out.println(X1.deMain() + " " + Y1.deMain());
//                    //size1 = X1.size();
//                    if(X1.size==0)
//                    {
//                        finalMain.deMain();
//                        flag1=0;
//                    }
//                }
//                else if (fq == 2) {
//                    //size2 = 0;
//                    System.out.println(X2.deMain() + " " + Y2.deMain());
//                   // size2 = X2.size();
//                    if(X2.size==0)
//                    {
//                        finalMain.deMain();
//                        flag2=0;
//                    }
//                }
//                else if (fq == 3) {
//                   // size3 = 0;
//                    System.out.println(X3.deMain() + " " + Y3.deMain());
//                    //size3 = X3.size();
//                    if(X3.size==0)
//                    {
//                        finalMain.deMain();
//                        flag3=0;
//                    }
//                }
//                else if (fq == 4) {
//                   // size4 = 0;
//                    System.out.println(X4.deMain() + " " + Y4.deMain());
//                    //size4 = X4.size();
//                    if(X4.size==0)
//                    {
//                        finalMain.deMain();
//                        flag4=0;
//                    }
//                }
//                //lasteleofq = fq;
//            }
//        }
//    }
//}
//class dynamic_Main extends Main {
//    @Override
//    public void enMain(int item) throws Exception {
//        if (isfull()) {
//            int na[] = new int[2 * data.length];
//            int cnt = 0;
//            for (int i = front; i < front + size; i++) {
//                na[cnt++] = data[i % data.length];
//            }
//            front = 0;
//            data = na;
//        }
//        super.enMain(item);
//    }
//}
