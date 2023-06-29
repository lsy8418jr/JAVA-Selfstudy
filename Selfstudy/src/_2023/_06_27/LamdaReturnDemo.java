package _2023._06_27;

interface MyInterface27 {
	int method(int x, int y);
}

public class LamdaReturnDemo {
	public static void main(String[] args) {
		MyInterface27 my;

		my = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(my.method(10, 3));

		my = (x, y) -> {
			return x + y;
		};
		System.out.println(my.method(20, 20));

		my = (x, y) -> x + y;

		System.out.println(my.method(11, 11));

	}
}
