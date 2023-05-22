package javaABeginners.chap11._03292023;

//Create a thread by implementing Runnable.
class MyThread implements Runnable {
	String thrdName;

	public MyThread(String name) {
		thrdName = name;
	}

	// Entry point of thread
	public void run() { // Threads start executing here.
		System.out.println(thrdName + " starting.");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrdName + ", count is " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrdName + " interrupted.");

		}
		System.out.println(thrdName + " terminating.");
	}
}

public class UseThreads {
	public static void main(String[] args) {
		System.out.println("Main thread starting.");

//First, construct a MyThread object.
		MyThread mt = new MyThread("child #1"); // Create a runnable object.

//Next, construct a thread from that object.
		Thread newThrd = new Thread(mt); // Construct a thread on that object.

//Finally, start execution of the thread.
		newThrd.start(); // Start running the thread.

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
