package codingbat.warmup_1._05092023;

public class StringBits {
	public static String stringBits(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i = i + 2) {
			newStr = newStr + str.charAt(i);
		}
		return newStr;

	}

	public static void main(String[] args) {
		System.out.println(stringBits("Heeololeo"));
		System.out.println(stringBits("hxaxpxpxy"));
	}
}
