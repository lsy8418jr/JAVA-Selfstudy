package java_A_Beginners.chap6._06202023;

class Rethrow {
	public static void genException() {
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
			} catch (ArithmeticException e) {
				System.out.println("cannot divide by zero");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("no matchig element found");
				throw e;
			}
		}
	}
}

public class RethrowDemo {
	public static void main(String[] args) {
		try {
			Rethrow.genException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("fatal error - " + "program terminated");
		}

	}
}
