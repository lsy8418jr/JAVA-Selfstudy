package codingbat._04042023;

public class Parrot {
	public static boolean parrotTrouble(boolean talking, int hour) {
		if (talking == true) {
			if (hour >= 7 && hour <= 20) {
				return false;
			} else
				return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(parrotTrouble(true, 10));
		System.out.println(parrotTrouble(false, 10));
		System.out.println(parrotTrouble(true, 6));
	}

}
