package codingbat.warmup_1._04212023;

public class MixStart {

	public static boolean mixStart(String str) {
		if (str.length() < 3) {
			return false;
		} else if (str.subSequence(1, 3).equals("ix")) {
			return true;
		}
		else 
			return false;
	}
public static void main(String[] args) {
	System.out.println(mixStart("mix snacks") );
	System.out.println(mixStart("pix snacks") );
	System.out.println(mixStart("nix") );
	System.out.println(mixStart("piz snacks") );
	System.out.println(mixStart("ix") );
	
	
}
}
