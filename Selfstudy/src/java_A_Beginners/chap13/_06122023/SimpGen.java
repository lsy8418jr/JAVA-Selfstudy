package java_A_Beginners.chap13._06122023;

class TwoGen<T, V> {
	T ob1;
	V ob2;

	public TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	void showType() {
		System.out.println("Type of T is " + ob1.getClass().getName());

		System.out.println("Type of V is " + ob2.getClass().getName());
	}

	T getOb1() {
		return ob1;
	}

	V getOb2() {
		return ob2;
	}
}

public class SimpGen {
	public static void main(String[] args) {
		TwoGen<Integer, String> tgob = new TwoGen<Integer, String>(88, "Generic");

		tgob.showType();

		int v = tgob.getOb1();
		System.out.println("int v value : " + v);

		String str = tgob.getOb2();
		System.out.println(("String str value : " + str));

	}
}
