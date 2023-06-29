package _2023._05252023;

class TickTock {
	String state;

	synchronized void tick(boolean running) {
		if (!running) {
			state = "ticked";
			notify(); // notify any waiting threads
			return;
		}

		System.out.print("tick ");
		state = "ticked";

		notify();
		try {
			while (!state.equals("tocked")) {
				wait();
			}
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}

	synchronized void tock(boolean running) {
		if (!running) {
			state = "tocked";
			notify();
			return;
		}
		System.out.print("tock ");
		state = "tocked";
		notify();
		try {
			while (!state.equals("ticked")) {
				wait();
			}
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}
	}
}

class MyThread1 implements Runnable {
	Thread thrd;
	TickTock ttob;

	public MyThread1(String name, TickTock ob) {
		thrd = new Thread(this, name);
		ttob = ob;
		thrd.start();
	}

	@Override
	public void run() {

		if (thrd.getName().compareTo("Tick") == 0) {
			for (int i = 0; i < 5; i++) {
				ttob.tick(true);
			}
		} else {
			for (int i = 0; i < 5; i++) {
				ttob.tock(true);
			}
			ttob.tock(false);
		}

	}

}

public class ThreadCom {
	public static void main(String[] args) {
		TickTock tt = new TickTock();
		MyThread1 t1 = new MyThread1("Tick", tt);
		MyThread1 t2 = new MyThread1("Tock", tt);

		try {
			t1.thrd.join();
			t2.thrd.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
	}
}
