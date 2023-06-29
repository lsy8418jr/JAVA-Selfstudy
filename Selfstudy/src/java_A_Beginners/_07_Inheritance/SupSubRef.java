package java_A_Beginners._07_Inheritance;



class X1{
	int a;
	
	X1(int i){
		a=i;
	}
}
class Y1 extends X1{
	int b;
	Y1(int i, int j){
		super(j);
		b=i;
	}
}




public class SupSubRef {
public static void main(String[] args) {
	X1 xob1= new X1(10);
	X1 xob2;
	
	Y1 yob=new Y1(5, 6);
	xob2=xob1; // OK, both of same type
	System.out.println(" xob2.a :"+xob2.a);
	
	xob2=yob; // still ok because Y1 is derived from X1
	System.out.println(" second xob2.a :"+xob2.a);
	xob2.a=18;
	System.out.println(" third xob2.a :"+xob2.a);
	
}
}
