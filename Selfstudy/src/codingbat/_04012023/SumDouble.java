package codingbat._04012023;

public class SumDouble {
	int sum(int a, int b) {
		if (a == b) {
			return (a + b) * 2;

		} else
			return a + b;
	}

	public static void main(String[] args) {
		SumDouble ob = new SumDouble();

		System.out.println(ob.sum(4, 5));
		System.out.println(ob.sum(3, 5));
		System.out.println(ob.sum(4, 4));
		System.out.println(ob.sum(5, 5));

	}

}
