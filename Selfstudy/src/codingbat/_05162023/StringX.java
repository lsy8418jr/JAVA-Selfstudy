package codingbat._05162023;

public class StringX {
	public String stringX(String str) {
		String result = "";
		if (str.length() == 0) {
			return "";
		} else if (str.length() < 2) {
			return String.valueOf(str.charAt(0));
		}

		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) != 'x') {
				result = result + str.charAt(i);
			}
		}
		return str.charAt(0) + result + str.charAt(str.length() - 1);
	}

	public static void main(String[] args) {
		StringX ob = new StringX();
		System.out.println(ob.stringX("ackjxjdixnx"));
	}
}
