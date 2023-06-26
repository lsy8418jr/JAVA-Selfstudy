package Selftaught._06222023;

class WObject {
	synchronized void methodA() {
		System.out.println("Thread A starting");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {

		}
	}

	synchronized void methodB() {
		System.out.println("Thread B starting");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {

		}
	}
}

class Thread_A extends Thread {
	WObject workob;

	public Thread_A(WObject workob) {

		this.workob = workob;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workob.methodA();
		}
	}
}

class Thread_B extends Thread {
	WObject workob;

	public Thread_B(WObject workob) {

		this.workob = workob;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workob.methodB();
		}
	}
}

public class NotifyWaitDemo {
	public static void main(String[] args) {
		WObject ob = new WObject();

		Thread thrdA = new Thread_A(ob);
		Thread thrdB = new Thread_B(ob);

		thrdA.start();
		thrdB.start();

		try {
			thrdA.join();
			thrdB.join();
		} catch (InterruptedException e) {
		}

	}
}
