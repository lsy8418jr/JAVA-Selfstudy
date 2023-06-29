package _2023._05_08;

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
