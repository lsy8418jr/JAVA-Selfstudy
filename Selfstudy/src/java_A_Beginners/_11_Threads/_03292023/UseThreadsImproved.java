package java_A_Beginners._11_Threads._03292023;

class MyThread1 implements Runnable {
	Thread thrd;

	public MyThread1(String name) {
		thrd = new Thread(this, name);
		thrd.start();
	}

	public void run() {
		System.out.println(thrd.getName() + " starting.");

		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + ", count is " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + "interupted");
		}
		System.out.println(thrd.getName() + " terminating.");
	}
}

public class UseThreadsImproved {
	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		MyThread1 mt = new MyThread1("child #1");

		for (int i = 0; i < 50; i++) {
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}
}
