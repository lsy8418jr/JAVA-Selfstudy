package _2023._05_24;

class MyThread3 implements Runnable {
	Thread thrd;

	public MyThread3(String name) {
		thrd = new Thread(this, name);
		thrd.start();

	}

	@Override
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

public class MoreThreads {
	public static void main(String[] args) {
		MyThread3 mt1 = new MyThread3("ch1");
		MyThread3 mt2 = new MyThread3("ch2");
		MyThread3 mt3 = new MyThread3("ch3");

		/*
		 * for (int i = 0; i < 50; i++) { System.out.print("%"); try {
		 * Thread.sleep(100); } catch (InterruptedException e) {
		 * System.out.println("main thread interrupted"); } }
		 */

		/*
		 * do { System.out.print("."); try { Thread.sleep(100); } catch
		 * (InterruptedException e) { System.out.println("main thread interrupted"); } }
		 * while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());
		 */

		
		try {
			mt1.thrd.join();
			System.out.println("ch1 joined");
			mt2.thrd.join();
			System.out.println("ch2 joined");
			mt3.thrd.join();
			System.out.println("ch3 joined");
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread ending");
	}
}
