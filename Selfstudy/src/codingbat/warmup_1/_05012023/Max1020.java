package codingbat.warmup_1._05012023;

public class Max1020 {
	public static int max1020(int a, int b) {
		int deter = Math.max(a, b);
		if (deter >= 10 && deter <= 20) {
			return deter;
		} else
			return 0;

	}

	public static void main(String[] args) {
		System.out.println(max1020(10, 23));
	}
}
