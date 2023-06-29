package _2023._06_15;

abstract class A {
	abstract void abc();
}

class B extends A {

	@Override
	void abc() {
		System.out.println("class implemented");
	}

}

public class AbstractClass_1 {
	public static void main(String[] args) {
		A b1 = new B();
		B b2 = new B();

		b1.abc();
		b2.abc();
	}
}
