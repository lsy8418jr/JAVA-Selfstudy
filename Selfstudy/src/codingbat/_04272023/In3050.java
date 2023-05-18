package codingbat._04272023;

public class In3050 {
	public static boolean in3050(int a, int b) {
		if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
			return true;
		} else if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(in3050(30, 31));
		System.out.println(in3050(15, 30));
		System.out.println(in3050(22, 40));
		System.out.println(in3050(41, 50));
		System.out.println(in3050(11, 50));

	}
}
