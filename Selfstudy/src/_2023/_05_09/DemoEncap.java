package _2023._05_09;

class Car {
	private String model, make;
	private int year;

	Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	String getMake() {
		return make;
	}

	String getModel() {
		return model;
	}

	int getYear() {
		return year;
	}

	void setMake(String make) {
		this.make = make;
	}

	void setModel(String model) {
		this.model = model;
	}

	void setYear(int year) {
		this.year = year;

	}

	void copy(Car ob) {
		this.setMake(ob.make);
		this.setModel(ob.model);
		this.setYear(ob.year);
	}
}

public class DemoEncap {
	public static void main(String[] args) {
		Car car1 = new Car("Subaru", "Crosstrek", 2024);
		// System.out.println(car1.model); cannot access

		// use getter method

		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());

		// car1.make="honda"; cannot access

		// use setter method

		car1.setMake("Honda");
		System.out.println(car1.getMake());
	}
}
