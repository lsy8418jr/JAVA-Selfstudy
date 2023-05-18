package codingbat._05182023;

public class ComboString {
	public static String comboString(String a, String b) {
		String outer, inner;
		if (a.length() > b.length()) {
			outer = b;
			inner = a;
		} else {
			outer = a;
			inner = b;
		}

		return outer + inner + outer;
	}

	public static void main(String[] args) {
		System.out.println(comboString("aaa", "b"));
		System.out.println(comboString("aaa", "1234"));
	}
}
