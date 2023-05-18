package codingbat._04212023;

public class StartOz {
	public static String startOz(String str) {
		if (str.length() < 2) {
			return str;
		}

		else if (str.subSequence(0, 2).equals("oz")) {
			return "oz";

		} else if (str.charAt(0) == 'o') {
			return "o";

		}

		else if (str.charAt(1) == 'z') {
			return "z";

		} else {
			return "";
		}

	}
	
	public static void main(String[] args) {
		System.out.println(startOz("ozymandias") );
		System.out.println(startOz("bzoo"));
	}
}
