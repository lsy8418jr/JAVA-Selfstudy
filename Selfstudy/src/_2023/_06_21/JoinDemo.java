package _2023._06_21;

class SumThread implements Runnable {
	private int sum = 0;

	int getSum() {
		return sum;
	}

	void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) {
		SumThread sumThrd = new SumThread();
		Thread thrd = new Thread(sumThrd);
		thrd.start();
		try {
			thrd.join(); // wiat for finishing Thread run method
		} catch (Exception e) {
		}
		System.out.println(sumThrd.getSum());
	}
}
