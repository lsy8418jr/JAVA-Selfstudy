package codingbat._04182023;

public class IcyHot {
	public static boolean icyHot(int temp1, int temp2) {
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(icyHot(20, 50));
		System.out.println(icyHot(-20, 50));
		System.out.println(icyHot(-20, 150));
		System.out.println(icyHot(20, -50));
		System.out.println(icyHot(120, -50));

	}
}
