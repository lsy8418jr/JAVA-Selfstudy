package java_A_Beginners._11_Threads._06072023;

class Thread11_1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class Thread11_2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) {
		Thread11_1 mt1 = new Thread11_1();
		Thread th1 = new Thread(mt1);

		Thread11_2 mt2 = new Thread11_2();
		Thread th2 = new Thread(mt2);

		th1.start();
		th2.start();

		try {
			th1.join(); // main method wait till finish thread th1 and th2
			th2.join();
		} catch (InterruptedException e) {
		}

		System.out.println("\nmain thread is terminated");
	}
}
