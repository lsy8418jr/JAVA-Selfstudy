package _2023._06_15;

interface IC1 {
	public static final int a = 3;

	public abstract void abc();
}

interface IC2 {
	int b = 5;

	void efg();
}

public class InterfaceCharac {
	public static void main(String[] args) {
		System.out.println(IC1.a);
		System.out.println(IC2.b);

		// A.a=10; a is a final
	}
}
