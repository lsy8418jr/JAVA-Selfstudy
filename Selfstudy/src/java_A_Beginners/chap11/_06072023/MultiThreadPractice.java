package java_A_Beginners.chap11._06072023;

import javax.swing.JOptionPane;

class MyThread15_1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

}

public class MultiThreadPractice {
	public static void main(String[] args) {
		MyThread15_1 mt = new MyThread15_1();
		Thread th = new Thread(mt);
		th.start();

		String str = JOptionPane.showInputDialog("Enter");
		System.out.println("your text is " + str);

	}
}
