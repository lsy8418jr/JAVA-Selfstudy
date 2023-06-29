package java_A_Beginners.chap14._06142023;

interface StringTest {
	boolean test(String str, String str2);
}

public class LambdaDemo3 {
	public static void main(String[] args) {

		StringTest isIn = (a, b) -> a.indexOf(b) != -1;

		String str = "This is a test";

		if (isIn.test(str, "is a")) {
			System.out.println("'is a' found");
		}
		if (isIn.test(str, "xyz")) {
			System.out.println("'xyz' Found");
		} else {
			System.out.println("'xyz' not found");
		}

	}
}
