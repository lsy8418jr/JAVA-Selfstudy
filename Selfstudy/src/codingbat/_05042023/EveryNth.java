package codingbat._05042023;

public class EveryNth {
	public String everyNth(String str, int n) {
		String finalStr = str.substring(0, 1);

		for (int i = n; i < str.length(); i = i + n) {

			finalStr = finalStr + str.charAt(i);

		}
		return finalStr;
	}

	public static void main(String[] args) {
		EveryNth o1 = new EveryNth();
		System.out.println(o1.everyNth("abcdefg", 3));
	}
}
