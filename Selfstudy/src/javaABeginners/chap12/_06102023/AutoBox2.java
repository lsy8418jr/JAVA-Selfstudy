package javaABeginners.chap12._06102023;

public class AutoBox2 {
	static void m(Integer v) {
		System.out.println("m() received " + v);
	}

	static int m2() {
		return 10;
	}

	static Integer m3() {
		return 99; // autoboxing 99 into Integer
	}

	public static void main(String[] args) {
		// autoboxing 99 into Integer
		m(99);

		// object ob received int value(10) and it autoboxing
		Integer ob = m2();
		System.out.println("Return value from m2() is " + ob);

		int i = m3();
		System.out.println("Return value from m3() is " + i);
	}
}
