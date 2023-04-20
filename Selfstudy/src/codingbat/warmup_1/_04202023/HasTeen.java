package codingbat.warmup_1._04202023;

public class HasTeen {
	public static boolean hasTeen(int a, int b, int c) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

	System.out.println(hasTeen(13, 20, 10));
	System.out.println(hasTeen(12, 9, 20));
	}
}
