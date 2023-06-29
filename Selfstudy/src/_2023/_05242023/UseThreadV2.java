package _2023._05242023;

class MyThread2 implements Runnable {
	Thread thrd;

	public MyThread2(String name) {
		thrd = new Thread(this, name);
		thrd.start();
	}

	public void run() {
		System.out.println(thrd.getName() + " starting");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("in" + thrd.getName() + ", count is " + count);
			}
		} catch (InterruptedException e) {
			System.out.println(thrd.getName() + "interrupted");
		}
		System.out.println(thrd.getName() + " terminating");
	}
}

public class UseThreadV2 {
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2("child");
		for (int i = 0; i < 50; i++) {
			System.out.print("%");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("main thread interrupted");
			}
		}
		System.out.println("main thread ending");
	}
}
