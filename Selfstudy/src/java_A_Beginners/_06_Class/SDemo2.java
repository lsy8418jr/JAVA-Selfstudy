package java_A_Beginners._06_Class;

class StaticMeth {
	static int val = 1024;

	static int valDiv2() {
		return val / 2;
	}
}

public class SDemo2 {

	public static void main(String[] args) {
		System.out.println("val is " + StaticMeth.val);
		System.err.println("StaticMeth.valDiv2():  " + StaticMeth.valDiv2());
		StaticMeth.val=4;
		System.out.println("val is " + StaticMeth.val);
		System.err.println("StaticMeth.valDiv2():  " + StaticMeth.valDiv2());
	}

}
