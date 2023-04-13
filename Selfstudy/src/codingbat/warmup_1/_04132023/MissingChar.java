package codingbat.warmup_1._04132023;

public class MissingChar {
	public static String missing(String str, int n) {
		if (n < str.length()) {
			String headstr = str.substring(0, n);
			String footstr = str.substring(n + 1, str.length());
			return headstr + footstr;
		}

		else
			return "wrong input";
	}

	public static void main(String[] args) {
		System.out.println(missing("012345", 5));
	}
}
