package java_A_Beginners._07_Inheritance;

class X {
	int a;

	X(int i) {
		a = i;
	}
}

class Y {
	int a;

	Y(int i) {
		a = i;
	}
}

public class IncompatibleRef {
	public static void main(String[] args) {
		X xob1 = new X(10);
		X xob2;

		Y yob = new Y(5);

		xob2 = xob1;// OK, both of same type (X type)

		System.out.println("xob1 : " + xob1.a);
		System.out.println("xob2 : " + xob2.a);
		System.out.println("yob : " + yob.a);

		// xob2=yob; ---Error, not of same type

	}
}
