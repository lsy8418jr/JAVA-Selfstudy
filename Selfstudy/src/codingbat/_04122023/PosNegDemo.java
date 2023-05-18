package codingbat._04122023;

public class PosNegDemo {
	public static boolean posNeg(int a, int b, boolean negative) {
		if (a * b < 0) {
			if (negative != true)
				return true;
			else
				return false;
		} else if (a < 0 && b < 0) {
			if (negative == true) {
				return true;
			} else {
				return false;
			}
		} else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(posNeg(4, -40, false));
		System.out.println(posNeg(-1, 1, false) );
		System.out.println(posNeg(-4, -5, false));
	}

}
