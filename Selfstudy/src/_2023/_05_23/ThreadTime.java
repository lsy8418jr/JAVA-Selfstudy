package _2023._05_23;

public class ThreadTime {

	static double startTime = 0;

	public static void main(String[] args) {
		Thread11_1 t1 = new Thread11_1();
		Thread11_2 t2 = new Thread11_2();
		t1.start();
		t2.start();
		startTime = System.currentTimeMillis();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

		System.out.println("\ntook time : " + startTime);
	}
}

class Thread11_1 extends Thread {
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print(0);
		}
	}
}

class Thread11_2 extends Thread {
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print(1);
		}
	}
}