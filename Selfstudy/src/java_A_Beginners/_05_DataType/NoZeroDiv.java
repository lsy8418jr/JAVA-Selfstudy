package java_A_Beginners._05_DataType;

public class NoZeroDiv {

	public static void main(String[] args) {

		double result;
		for (int i = -5; i < 6; i++) {
			result = (double)i != 0 ? 100 / i : 0;
			if (i != 0) {
				System.out.println("100 / " + i + " is " + result);
			}
		}

	}

}
