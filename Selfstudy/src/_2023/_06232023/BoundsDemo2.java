package _2023._06232023;

public class BoundsDemo2 {
	public static <T extends Number> boolean compare(T a, T b) {
		System.out.println("compare(" + a.getClass().getSimpleName() + " , " + b.getClass().getSimpleName() + ")");

		double d1 = a.doubleValue();
		double d2 = b.doubleValue();

		return (d1 == d2);

	}

	public static void main(String[] args) {
		boolean result = compare(10, 20);
		System.out.println(result);

		boolean result2 = compare(3.3, 3.3);
		System.out.println(result2);
	}
}
