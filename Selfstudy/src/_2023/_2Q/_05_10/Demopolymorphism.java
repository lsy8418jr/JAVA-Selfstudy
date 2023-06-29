package _2023._2Q._05_10;

class Vehicle {
	public void go() {
	}
}

class Car extends Vehicle {
	@Override
	public void go() {
		System.out.println("the car begins moving");
	}
}

class Bicycle extends Vehicle {
	@Override
	public void go() {
		System.out.println("the bicycle begins moving");
	}
}

class Boat extends Vehicle {
	@Override
	public void go() {
		System.out.println("the boat begins moving");
	}
}

public class Demopolymorphism {
	public static void main(String[] args) {
		Car car1 = new Car();
		Bicycle bicycle1 = new Bicycle();
		Boat boat1 = new Boat();

		System.out.println("this is way 1 to show the method\n");
		car1.go();
		bicycle1.go();
		boat1.go();
		System.out.println();

		System.out.println("this is way 2 using polymorphism\n");
		Vehicle[] racer = { car1, bicycle1, boat1 };

		for (Vehicle ob : racer) {
			ob.go();
		}

	}
}
