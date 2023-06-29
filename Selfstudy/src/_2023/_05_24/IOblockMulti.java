package _2023._05_24;

import javax.swing.JOptionPane;

class Thread5_1 extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class IOblockMulti {
	public static void main(String[] args) {

		Thread5_1 th1 = new Thread5_1();
		th1.start();

		String input = JOptionPane.showInputDialog("enter your text");
		System.out.println(input);

	}
}
