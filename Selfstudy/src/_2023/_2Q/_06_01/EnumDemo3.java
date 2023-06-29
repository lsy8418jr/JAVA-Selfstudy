package _2023._2Q._06_01;

enum Transport {
	CAR(65), TRUCK(55), AIR(600), TRAIN(70), BOAT(22);

	private int speed;

	Transport(int s) {
		speed = s;
	}

	int getSpeed() {
		return speed;
	}

}

public class EnumDemo3 {
	public static void main(String[] args) {
		Transport tp;
		System.out.println("typical speed for an airplane is " + Transport.AIR.getSpeed() + " MPH\n");

		System.out.println("All transport speeds ");
		for (Transport t : Transport.values()) {
			System.out.println(t + " typical speed is " + t.getSpeed() + " MPH");
		}

	}
}
