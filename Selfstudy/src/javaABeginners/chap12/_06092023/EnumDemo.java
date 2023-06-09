package javaABeginners.chap12._06092023;

enum Transport {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo {
	public static void main(String[] args) {
		Transport tp;
		tp = Transport.AIRPLANE;

		System.out.println("value of tp; " + tp + "\n");

		tp = Transport.TRAIN;
		if (tp == Transport.TRAIN) {
			System.out.println("tp contains TRAIN.\n");
		}
		switch (tp) {
		case CAR:
			System.out.println("A car carries people.");
			break;
		case TRUCK:
			System.out.println("A truck carries freight.");
			break;
		case AIRPLANE:
			System.out.println("An airplane flies.");
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
