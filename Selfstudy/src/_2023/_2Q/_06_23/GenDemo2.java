package _2023._2Q._06_23;

interface Rent<R> {
	R ob();
}

class Home {
	void turnLight() {
		System.out.println("light is on");
	}
}

class Car {
	void run() {
		System.out.println("the car is running");
	}
}

class HomeAgency implements Rent<Home> {

	@Override
	public Home ob() {
		return new Home();
	}
}

class CarDealer implements Rent<Car> {
	@Override
	public Car ob() {
		return new Car();
	}
}

public class GenDemo2 {
	public static void main(String[] args) {
		HomeAgency haOb = new HomeAgency();
		Home homeOb = new Home();
		homeOb.turnLight();

		CarDealer cdOb = new CarDealer();
		Car carOb = new Car();
		carOb.run();
	}
}
