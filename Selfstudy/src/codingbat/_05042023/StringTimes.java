package codingbat._05042023;

public class StringTimes {

	public String stringTimes(String str, int n) {
		String finalStr = "";
		for (int i = 0; i < n; i++) {
			finalStr = finalStr + str;
		}
		return finalStr;
	}

	public static void main(String[] args) {

		StringTimes s1 = new StringTimes();
		System.out.println(s1.stringTimes("Scott", 3));
	}
}
