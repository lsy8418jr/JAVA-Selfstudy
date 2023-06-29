package _2023._05_25;

class Thread8_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("\nt1 terminated");
	}
}

class Thread8_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("\nt2 terminated");
	}
}

public class ThrdMethod1_delay {

	static void delay(int second) {
		try {
			Thread.sleep(second);

		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		Thread8_1 t1 = new Thread8_1();
		Thread8_2 t2 = new Thread8_2();
		t1.start();
		t2.start();

		delay(1500);

		System.out.println("\nmain ends");
	}
}
