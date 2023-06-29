package _2023._2Q._05_09;

public class CopyObject {

	public static void main(String[] args) {

		Car car2 = new Car("Honda", "CRV", 2023);
		Car car3 = new Car("Kia", "Soul", 2020);

		car3.copy(car2);

		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		System.out.println();
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());

		car3.copy(car2);

		car2.setMake("Toyota");

		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car3.getMake());

	}

}
