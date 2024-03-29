package _2023._2Q._06_01;

enum TrafficLightColor {
	RED, YELLOW, GREEN
}

class TrafficLightSimulator implements Runnable {
	private Thread thrd;
	private TrafficLightColor tlc;
	boolean stop = false;
	boolean changed = false;

	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;

		thrd = new Thread(this);
		thrd.start();
	}

	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
		thrd = new Thread(this);
		thrd.start();
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				switch (tlc) {
				case GREEN:
					Thread.sleep(10000);
					break;
				case YELLOW:
					Thread.sleep(2000);
					break;
				case RED:
					Thread.sleep(12000);
				}

			} catch (InterruptedException e) {
				System.out.println(e);
			}
			changeColor();
		}
	}

	synchronized void changeColor() {
		switch (tlc) {
		case RED:
			tlc = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColor.RED;
			break;
		case GREEN:
			tlc = TrafficLightColor.YELLOW;
			break;
		}
		changed = true;
		notify();
	}

	synchronized void waitForChange() {
		try {
			while (!changed) {
				wait();
			}
			changed = false;
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	synchronized TrafficLightColor getColor() {
		return tlc;
	}

	synchronized void cancel() {
		stop = true;
	}
}

public class TrafficLightDemo {
	public static void main(String[] args) {
		TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.GREEN);

		for (int i = 0; i < 9; i++) {
			System.out.println(tl.getColor());
			tl.waitForChange();
		}
		tl.cancel();
	}
}
