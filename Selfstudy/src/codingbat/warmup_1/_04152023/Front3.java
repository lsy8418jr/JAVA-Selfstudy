package codingbat.warmup_1._04152023;

public class Front3 {

	public static String front3(String str) {
		String alteredStr;
		if (str.length() >= 3) {
			alteredStr = str.substring(0, 3);
			return alteredStr + alteredStr + alteredStr;
		} else {
			return str + str + str;
		}
	}

	public static void main(String[] args) {

		System.out.println(front3("hi"));
		System.out.println(front3("hello"));
		System.out.println(front3("Nice work"));
		System.out.println(front3("Who are you"));
		System.out.println(front3("orange"));
	}
}
