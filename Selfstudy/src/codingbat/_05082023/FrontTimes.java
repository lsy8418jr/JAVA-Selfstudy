package codingbat._05082023;

public class FrontTimes {
	public static String frontTimes(String str, int n) {
		String printStr = "";
		if (str.length() < 3) {
			for (int i = 0; i < n; i++) {
				printStr = printStr + str;
			}
			return printStr;

		} else {

			for (int i = 0; i < n; i++) {
				printStr = printStr + str.substring(0, 3);
			}
			return printStr;
		}
	}

	public static void main(String[] args) {
		System.out.println(frontTimes("ab def", 5));
	}

}
