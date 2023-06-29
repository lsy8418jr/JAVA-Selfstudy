package _2023._05252023;

class SumArray {
	private int sum;

	synchronized int SumArray(int nums[]) {
		sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}

		}
		return sum;
	}
}

class MyThread implements Runnable {
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;

	MyThread(String name, int nums[]) {
		thrd = new Thread(this, name);
		a = nums;
		thrd.start();
	}

	@Override
	public void run() {
		int sum;

		System.out.println(thrd.getName() + " starting");

		answer = sa.SumArray(a);
		System.out.println("Sum for " + thrd.getName() + " is " + answer);
		System.out.println(thrd.getName() + " terminating");
	}

}

public class Sync {
	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5};
		
		MyThread mt1 = new MyThread("child 1", a);
		MyThread mt2 = new MyThread("child 2", a);
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
	}
}
