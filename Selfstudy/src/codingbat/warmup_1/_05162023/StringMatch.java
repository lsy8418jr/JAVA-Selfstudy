package codingbat.warmup_1._05162023;

public class StringMatch {
	public int stringMatch(String a, String b) {

		int strLength = Math.min(a.length(), b.length());
		int count = 0;

		if (strLength == 0) {
			return 0;
		} else {
			for (int i = 0; i < strLength - 1; i++) {
				String subA = a.substring(i, i + 2);
				String subB = b.substring(i, i + 2);
				if (subA.equals(subB)) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		StringMatch ob = new StringMatch();
		System.out.println(ob.stringMatch("1234567", "12445"));
		System.out.println(ob.stringMatch("aabbccdd", "abbbxxd"));
	}
}
