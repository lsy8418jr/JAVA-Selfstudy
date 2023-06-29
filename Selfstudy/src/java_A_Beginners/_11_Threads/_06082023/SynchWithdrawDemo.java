package java_A_Beginners._11_Threads._06082023;

class Account2 {
	private double balance = 1000;

	public double getBalance() {
		return balance;
	}

	public synchronized void withdraw(double money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
				balance -= money;

			} catch (InterruptedException e) {
			}
		}
	}
}

class Runnable22 implements Runnable {
	Account2 acc = new Account2();

	@Override
	public void run() {
		while (acc.getBalance() > 0) {
			double money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);

			System.out.println("balance : " + acc.getBalance());

		}
	}

}

public class SynchWithdrawDemo {
	public static void main(String[] args) {
		Runnable22 r = new Runnable22();

		Thread th = new Thread(r);
		th.start();
		try {
			th.join();
		} catch (Exception e) {

		}
		System.out.println("please deposit more money");
	}
}
