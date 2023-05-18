package codingbat._04272023;

public class IntMax {

	public int intMax(int a, int b, int c) {
		int tempMax = Math.max(a, b);

		return Math.max(tempMax, c);
	}

	public static void main(String[] args) {
		IntMax ob = new IntMax();
		System.out.println(ob.intMax(3, 2, 1));
		System.out.println(ob.intMax(5, 7, 1));
		System.out.println(ob.intMax(3, 9, 77));
		System.out.println(ob.intMax(2, 2, 2));

	}

}
