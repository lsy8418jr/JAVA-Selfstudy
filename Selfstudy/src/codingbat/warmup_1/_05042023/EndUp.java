package codingbat.warmup_1._05042023;

public class EndUp {

	public String endUp(String str) {

		if (str.length() < 3) {
			return str.toUpperCase();
		} else {
			String newStr = str.substring(str.length() - 3, str.length());
			return str.subSequence(0, str.length() - 3) + newStr.toUpperCase();
		}

	}

	public static void main(String[] args) {
		EndUp s1 = new EndUp();

		System.out.println(s1.endUp("hi"));

		System.out.println(s1.endUp("scott"));

	}
}
