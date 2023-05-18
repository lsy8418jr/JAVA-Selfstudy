package codingbat._04132023;

public class FrontBack {
	public static String frontBack(String str) {
		if (str.length() <= 1) {
			return str;
		}

		else {
			char first = str.charAt(0);
			char last = str.charAt(str.length() - 1);
			String newStr = str.substring(1, str.length() - 1);
			return last + newStr + first;
		}

	}

	public static void main(String[] args) {
		System.out.println(frontBack("abcdefg"));
		System.out.println(frontBack("a"));
		System.out.println(frontBack("Chocolate"));

	}

}
