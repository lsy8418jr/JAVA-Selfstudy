package java_A_Beginners._07_Inheritance;

class SuperA{
	int i;
}

class SubB extends SuperA{
	int i;
	
	SubB(int a, int b){
		super.i=a;  // super.i refers to "i" in SuperA
		i=b;
	}
	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}


public class UseSuper {
public static void main(String[] args) {
	SubB on=new SubB(1, 2);
	
	on.show();
}
}
