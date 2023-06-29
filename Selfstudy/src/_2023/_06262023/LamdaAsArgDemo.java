package _2023._06262023;

interface StringFunc1 {
	String func(String b);
}

public class LamdaAsArgDemo {
	static String stringOp(StringFunc1 sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "Lamda add power to Java";
		String outStr;

		System.out.println("Here is input string :" + inStr);
		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("The string in uppercase: " + outStr);

		outStr = stringOp((str) -> {
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ') {
					result += str.charAt(i);
				}
			}
			return result;
		}, inStr);

		System.out.println("the string with space removed :" + outStr);

		StringFunc1 reverse = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println("the string reversed : " + stringOp(reverse, inStr));

	}
}
