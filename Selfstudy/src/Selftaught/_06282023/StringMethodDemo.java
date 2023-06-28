package Selftaught._06282023;

public class StringMethodDemo {
	public static void main(String[] args) {
		String s;
		int a = 2;
		StringBuffer sb = new StringBuffer(40);

		s = sb.append("a=").append(a).append("!").toString();

		System.out.println(s + "\n");

		StringBuffer sb2 = new StringBuffer("I java");
		sb2.insert(2, "like ");
		System.out.println(sb2 + "\n");

		StringBuffer sb3 = new StringBuffer("abdefg");
		System.out.println("before reversed : " + sb3);
		System.out.println("after reversed : " + sb3.reverse() + "\n");

		StringBuffer sb4 = new StringBuffer("This is a test");

		System.out.println("before replaced: " + sb4);
		System.out.println("after replaced : " + sb4.replace(5, 7, "was"));
		System.out.println();

	}

}
