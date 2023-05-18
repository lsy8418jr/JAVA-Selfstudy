package codingbat._04152023;

public class StartHi {
	public static boolean startHi(String str) {

		if (str.length() < 2) {
			return false;
		}

		else if (str.subSequence(0, 2).equals("hi")) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(startHi("hi Scott"));
		System.out.println(startHi("hello Scott"));
	}

}
