package java_A_Beginners.chap7;

class Chap7A {
	int i, j;

	Chap7A(int a, int b) {
		i = a;
		j = b;
	}

	void show() {
		System.out.println("i and j: " + i + " " + j);
	}

}

class Chap7B extends Chap7A {
	int k;

	Chap7B(int a, int b, int c) {
		super(a, b);
		k = c;

	}

	void show() {
		
		super.show();
		
		System.out.println("k: " + k);

	}

}

public class Override {
public static void main(String[] args) {
	Chap7B subOb=new Chap7B(1, 2, 3	);
	subOb.show();
}
}
