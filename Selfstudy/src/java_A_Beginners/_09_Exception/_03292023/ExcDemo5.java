package java_A_Beginners._09_Exception._03292023;

public class ExcDemo5 {
	public static void main(String[] args) {
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
			} catch (ArrayIndexOutOfBoundsException exc) {
				// catch the exception
				System.out.println("No matching element found.");
			} catch (Throwable exc) {
				System.out.println("Some exception occurred.");
			}
		}
	}
}