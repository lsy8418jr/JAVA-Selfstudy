package java_A_Beginners.chap5;

public class ArraysAverage {

	public static void main(String[] args) {

		double total = 0;
		double x[] = { 2, 4, 55, 2, 33, 6, 77, 43, 75, 11 };
		for (double temp : x) {
			total += temp;
		}
		System.out.println("average is : " + total / x.length);
	}

}
