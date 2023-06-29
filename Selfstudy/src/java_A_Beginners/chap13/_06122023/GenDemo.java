package java_A_Beginners.chap13._06122023;

class Gen<T> {

	T ob;

	public Gen(T o) {
		ob = o;
	}

	T getOb() {
		return ob;
	}

	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

public class GenDemo<T> {
	public static void main(String[] args) {
		Gen<Integer> iOb;

		iOb = new Gen<Integer>(88);

		iOb.showType();

		int v = iOb.getOb();
		System.out.println("int value : " + v);
		System.out.println();

		Gen<String> strOb;
		strOb = new Gen<String>("Generic test");

		strOb.showType();

		String str = strOb.getOb();
		System.out.println("String value : " + str);
	}
}
