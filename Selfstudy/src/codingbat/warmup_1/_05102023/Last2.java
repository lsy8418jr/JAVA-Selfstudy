package codingbat.warmup_1._05102023;

public class Last2 {
	public int last2(String str) {
		int l = str.length(); // l stands for str.length()

		int count = 0;

		if (l < 2)
			return 0;
		else {
			String lastStr = str.substring(l - 2);
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.substring(i, i + 2).equals(lastStr)) {
					count = count + 1;
				}
			}
			return count;
		}
	}

	public static void main(String[] args) {
		Last2 ob = new Last2();

		System.out.println(ob.last2("xxxx"));
	}
}
