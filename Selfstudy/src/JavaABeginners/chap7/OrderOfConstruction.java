package JavaABeginners.chap7;
//Demonstrate when constructors are executed.

class SuperA1 {
	public SuperA1() {
		System.out.println("Constructing A.");
	}
}

class SubB1 extends SuperA1 {
	SubB1() {

		System.out.println("Constructing B.");
	}
}

class C extends SubB1 {
	C() {
		System.out.println("Constructing C.");
	}
}

public class OrderOfConstruction {

	public static void main(String[] args) {

		C obC = new C();
	}

}
