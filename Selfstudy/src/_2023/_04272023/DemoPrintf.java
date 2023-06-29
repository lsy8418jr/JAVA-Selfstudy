package _2023._04272023;

public class DemoPrintf {
	public static void main(String[] args) {
		boolean b = true;
		char c = '$';
		String s = "Scott";
		int i = 40;
		double d = 4.0;

		System.out.printf("%b\n", b);
		System.out.printf("%c\n", c);
		System.out.printf("%s\n", s);
		System.out.printf("%d\n", i);
		System.out.printf("%f\n", d);

		System.out.printf("hello %10s\n", s); // space given from the left
		System.out.printf("hello %-10s\n", s); // space given from the right

		System.out.printf("%.2f\n", d); // set decimal place 2 
		System.out.printf("%.4f\n", d); // set decimal place  4

	}
}
