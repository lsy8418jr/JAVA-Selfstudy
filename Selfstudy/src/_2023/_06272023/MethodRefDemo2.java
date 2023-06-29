package _2023._06272023;

interface StringFunc2 {
	String func(String n);
}

class MyStringOps2 {
	String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}

public class MethodRefDemo2 {
	static String stringOp(StringFunc2 sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "Lamda add power to java";
		String outstr;
		MyStringOps2 strops = new MyStringOps2();
		outstr = stringOp(strops::reverse, inStr);

		System.out.println(outstr);
	}
}
