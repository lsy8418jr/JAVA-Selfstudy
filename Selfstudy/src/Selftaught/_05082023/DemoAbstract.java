package Selftaught._05082023;

abstract class Vehicle {
	abstract void go();
}

class Car extends Vehicle {
	@Override
	void go() {
		System.out.println("the car is moving");
	}

}

public class DemoAbstract {
	public static void main(String[] args) {
		Car ob = new Car();
		ob.go();
	}
}
