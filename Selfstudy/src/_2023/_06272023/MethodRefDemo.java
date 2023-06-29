package _2023._06272023;

interface StringFunc {
	String func(String n);
}

class MyStringOps {
	static String strReverse(String n) {
		String result = "";
		for (int i = n.length() - 1; i >= 0; i--) {
			result += n.charAt(i);
		}
		return result;
	}
}

public class MethodRefDemo {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String instr = "Lamda add power to Java";
		String outstr;

		outstr = stringOp(MyStringOps::strReverse, instr);

		System.out.println("the origina string: " + instr);
		System.out.println("String reversed: " + outstr);
	}

}
