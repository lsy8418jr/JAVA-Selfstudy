package Selftaught._05242023;

class Thread6_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class Thread6_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		Thread6_1 th1 = new Thread6_1();
		Thread6_2 th2 = new Thread6_2();
		th2.setPriority(7);

		System.out.println("th1 priority " + th1.getPriority());
		System.out.println("th2 priority " + th2.getPriority());

		th1.start();
		th2.start();
	}
}
