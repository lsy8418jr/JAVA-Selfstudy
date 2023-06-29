package _2023._2Q._06_21;

import java.awt.Toolkit;

class Beep implements Runnable {

	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {

			tk.beep();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class BeepPrint {
	public static void main(String[] args) {
		Beep bp = new Beep();
		Thread thrd = new Thread(bp);
		thrd.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
