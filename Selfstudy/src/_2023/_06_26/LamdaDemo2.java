package _2023._06_26;

interface StringFunc {
	String func(String n);
}

public class LamdaDemo2 {
	public static void main(String[] args) {
		StringFunc reverse = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println("Lamda reversed is " + reverse.func("Lamda"));
		System.out.println("expression reversed is " + reverse.func("Expression"));

	}
}
