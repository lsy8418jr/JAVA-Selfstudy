package Selftaught._06212023;

class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}

class User1 extends Thread {
	private Calculator userCal;

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.userCal = calculator;
	}

	public void run() {
		userCal.setMemory(100);
	}
}

class User2 extends Thread {
	private Calculator userCal;

	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.userCal = calculator;
	}

	public void run() {
		userCal.setMemory(50);
	}
}

class ThreadMain {
	public static void main(String[] args) {
		Calculator calOb = new Calculator();

		User1 user1Ob = new User1();
		user1Ob.setCalculator(calOb);
		user1Ob.start();

		User2 user2Ob = new User2();
		user2Ob.setCalculator(calOb);
		user2Ob.start();

	}
}