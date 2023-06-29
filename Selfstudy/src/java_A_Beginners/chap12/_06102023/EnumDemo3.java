package java_A_Beginners.chap12._06102023;

enum Transport3 {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

	private int speed;

	private Transport3(int s) {
		speed = s;

	}

	int getSpeed() {
		return speed;
	}

}

public class EnumDemo3 {
	public static void main(String[] args) {
		Transport3 tp;

		System.out.println("Typical speed for an airplane is " + Transport3.AIRPLANE.getSpeed() + " miles per hour.\n");

		System.out.println("All Transport speeds: ");

		for (Transport3 t : Transport3.values()) {
			System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
		}
	}
}
