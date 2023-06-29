package _2023._05_31;

enum Transport {
	CAR, TRUCK, AIR, TRAIN, BOAT
}

public class EnumDemo {
	public static void main(String[] args) {
		Transport tp = Transport.AIR;

		System.out.println("value of tp : " + tp);
		System.out.println();

		tp = Transport.TRAIN;

		if (tp == Transport.TRAIN) {
			System.out.println("tp contains TRAIN\n");
		}

		switch (tp) {
		case CAR:
			System.out.println("A car carries people");
			break;
		case TRUCK:
			System.out.println("A truck carries freight");
			break;
		case AIR:
			System.out.println("A airplane flies");
			break;
		case TRAIN:
			System.out.println("A train runs on rails.");
			break;
		case BOAT:
			System.out.println("A boat sails on water.");
			break;
		}
	}
}
