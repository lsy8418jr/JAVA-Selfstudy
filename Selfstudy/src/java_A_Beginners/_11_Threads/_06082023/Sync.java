package java_A_Beginners._11_Threads._06082023;

class SumArray {
	private int sum;

	synchronized int sumArray(int nums[]) {
		sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("running total for " + Thread.currentThread().getName() + " is " + sum);
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {
				System.out.println("thread interrupted");
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

	public MyThread(String name, int nums[]) {

		thrd = new Thread(this, name);
		a = nums;
		thrd.start();
	}

	@Override
	public void run() {
		int sum;
		System.out.println((thrd.getName() + " starting"));
		answer = sa.sumArray(a);
		System.out.println("sum for " + thrd.getName() + " is " + answer);
		System.out.println(thrd.getName() + " terminating");
	}
}

public class Sync {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		MyThread mt1 = new MyThread("child 1", a);
		MyThread mt2 = new MyThread("child 2", a);
		
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}catch(InterruptedException e) {}
	}
}
