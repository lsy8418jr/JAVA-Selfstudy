package _2023._06_26;

interface SomeFunc<T> {
	T func(T t);
}

public class GenericFuncInterfaceDemo {
	public static void main(String[] args) {
		SomeFunc<String> reverse = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println("Lamda reversed is " + reverse.func("Lamda"));
		System.out.println("expression reversed is " + reverse.func("Expression"));

		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;

			for (int i = 1; i < n; i++) {
				result += i * result;
			}
			return result;
		};
		System.out.println("the factorial fo 3 is " + factorial.func(3));
		System.out.println("the factorial fo 7 is " + factorial.func(7));
	}
}
