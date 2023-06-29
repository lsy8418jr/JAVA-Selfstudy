package _2023._04272023;

public class UsingFinal {
	public static void main(String[] args) {
		double pi = 3.14;
		pi = 6;
		System.out.println("assigned value of pi : " + pi);

		final double PI = 3.14;

		// PI=6; this is an error

		System.out.println("final value of pi :" + PI);
	}
}
