package codingbat.warmup_1._04272023;

public class Close10 {
	public int close10(int a, int b) {
		int tempA = Math.abs(10 - a);
		int tempB = Math.abs(10 - b);

		if (tempA > tempB) {
			return b;
		} else if (tempA < tempB) {
			return a;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Close10 ob = new Close10();
		System.out.println(ob.close10(13, 8));
		System.out.println(ob.close10(5, 5));
		System.out.println(ob.close10(11, 12));
		System.out.println(ob.close10(10, 12));

	}
}
