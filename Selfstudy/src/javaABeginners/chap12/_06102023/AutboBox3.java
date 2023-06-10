package javaABeginners.chap12._06102023;

public class AutboBox3 {
	public static void main(String[] args) {
		Integer iOb, iOb2;
		int i;

		iOb = 99;
		System.out.println("Original value of iOb: " + iOb);

		++iOb;
		System.out.println("After ++iOb: " + iOb);

		iOb += 10;
		System.out.println("After iOb += 10: " + iOb);

		iOb2 = iOb + iOb / 2;
		System.out.println("iOb2 after expression: " + iOb2);

		i = iOb + iOb / 2;
		System.out.println("i after expression: " + i);

	}
}
