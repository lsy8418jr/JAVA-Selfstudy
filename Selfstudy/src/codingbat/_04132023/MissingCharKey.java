package codingbat._04132023;

public class MissingCharKey {
	public static String missing(String str, int n) {
		String head=str.substring(0,n);
		String foot=str.substring(n+1, str.length());
		return head+foot;
	}

	public static void main(String[] args) {
		System.out.println(missing("012345", 4));
	}
}
