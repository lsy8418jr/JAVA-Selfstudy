package _2023._05_02;

public class PassOb {
	public static void main(String[] args) {
		Car myCar = new Car("CRV");
		Garage myGarage = new Garage();

		myGarage.park(myCar);
	}
}

class Car {
	String name;

	Car(String name) {
		this.name = name;
	}
}

class Garage {
	void park(Car ob) {
		System.out.println("Your " + ob.name + " is parked");
	}
}