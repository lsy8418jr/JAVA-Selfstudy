package Selftaught._05232023;

class ThreadEx1_1 extends Thread {
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print(0);
		}
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print(1);
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
	}
}
