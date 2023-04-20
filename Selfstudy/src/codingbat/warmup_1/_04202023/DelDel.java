package codingbat.warmup_1._04202023;

public class DelDel {
	public static String delDel(String str) {
		if (str.length() >= 4) {
			if (str.subSequence(1, 4).equals("del")) {
				return str.replace("del", "");
			} else {
				return str;
			}
		} else
			return str;
	}
public static void main(String[] args) {
	System.out.println(delDel("adelbc"));
	System.out.println(delDel("adedbc"));
	
}
}
