package Selftaught;

public class TryCatchFinally {

	public static void main(String[] args) {

		System.out.println(1);

		try {
			System.out.println(5 / 0);

			System.out.println(2);
		} catch (ArithmeticException ae) {
			System.out.println(3);
		}

		catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}

	}

}
