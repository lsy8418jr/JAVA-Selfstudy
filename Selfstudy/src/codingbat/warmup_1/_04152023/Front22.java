package codingbat.warmup_1._04152023;

public class Front22 {

	public static String front22(String str) {

		if (str.length() > 2) {
			String front22 = str.substring(0, 2);
			return front22 + str + front22;
		} else
			return str + str + str;

	}

	public static void main(String[] args) {
		System.out.println(front22("abc"));
		System.out.println(front22("human"));
		System.out.println(front22("car"));
		System.out.println(front22("apple"));
		System.out.println(front22("a"));
		
	}

}
