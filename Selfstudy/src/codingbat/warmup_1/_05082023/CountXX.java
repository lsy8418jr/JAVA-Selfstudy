package codingbat.warmup_1._05082023;

public class CountXX {
	int countXX(String str) {
		int count = 0;
		String evalStr = "";
		for (int i = 0; i < str.length() - 1; i++) {
			evalStr = str.substring(i, i + 2);
			if (evalStr.equals("xx")) {
				++count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		CountXX ob = new CountXX();
		System.out.println(ob.countXX("abcXXbdXXXxx"));
		System.out.println(ob.countXX("Hello there"));
	}
}
