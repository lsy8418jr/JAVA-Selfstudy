package _2023._05_02;

public class DemoToString {
	public static void main(String[] args) {
		DemoCar ob = new DemoCar();
		System.out.println(ob.toString());
	}
}

class DemoCar {
	String make = "Honda";
	String model = "CRV";
	String color = "Gray";
	int year = 2014;

	public String toString() {
		String str = make + " " + model + " " + color + " " + year;
		return str;
	}

}