package _2023._2Q._06_20;

class Outer {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;

	void abc() {
		Inner inOb = new Inner();
		System.out.println("method of outer\n");
		inOb.efg();
	}

	class Inner {
		void efg() {
			System.out.println("calling from inner");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
	}
}

public class AccessInner {
	public static void main(String[] args) {
		Outer outOb = new Outer();
		outOb.abc();
	}
}
