package _2023._06202023;

class MyThread1 extends Thread {

	@Override
	public void run() {
		String[] strArray = { "one", "two", "three", "four", "five" };
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

		}
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("- (sub-number)" + strArray[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class MultiThreadDemo1 {
	public static void main(String[] args) {

		Thread thrd = new MyThread1();
		thrd.start();

		int[] intArray = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(frame-number)" + intArray[i]);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
			}
		}
	}
}
