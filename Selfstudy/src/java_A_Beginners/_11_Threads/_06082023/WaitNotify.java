package java_A_Beginners._11_Threads._06082023;

import java.util.ArrayList;

class Customer2 implements Runnable {
	private Table2 table;
	private String food;

	private void Customer(Table2 table, String food) {
		this.table = table;
		this.food = food;

	}

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			String name = Thread.currentThread().getName();

			table.remove(food);
			System.out.println(name + " ate a" + food);

		}
	}
}

class Cook2 implements Runnable {
	private Table2 table;

	public Cook2(Table2 table) {

		this.table = table;

	}

	@Override
	public void run() {
		while (true) {
			int idx = (int) (Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {
			}
		}
	}
}

class Table2 {
	String[] dishNames = { "donut", "pizza", "burger" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();

	public synchronized void add(String dish) {
		while (dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + "  is waiting");

			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		dishes.add(dish);
		notify();
		System.out.println("dishes " + dishes.toString());
	}

	public void remove(String dishNames) {
		synchronized (this) {
			String name = Thread.currentThread().getName();

			while (true) {
				for (int i = 0; i < dishes.size(); i++) {
					if (dishNames.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();
						return;
					}
				}

				try {
					System.out.println(name + " is waiting");
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public int dishNum() {
		return dishNames.length;
	}
}

public class WaitNotify {
public static void main(String[] args) {
	Table2 table=new Table2();
	
	new Thread(new Cook2(table),"cook").start();
	
	
	
	
	
}
}
