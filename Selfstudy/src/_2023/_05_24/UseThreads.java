package _2023._05_24;

class myThread implements Runnable {
	String thrdName;

	public myThread(String name) {
		thrdName = name;
	}

	public void run() {
		System.out.println(thrdName + " String");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(600);
				System.out.println("count is " + count);
			}
		} catch (InterruptedException e) {
			System.out.println(thrdName + " interrupted");
		}
		System.out.println(thrdName + " terminating");
	}
}

public class UseThreads {
	public static void main(String[] args) {
		System.out.println("Main thread starting");

		myThread mt = new myThread("*");

		Thread newThrd = new Thread(mt);

		newThrd.start();

		for (int i = 0; i < 50; i++) {
			System.out.print("(" + i + ")");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted");
			}
		}

		System.out.println("main thread ending");
	}
}
