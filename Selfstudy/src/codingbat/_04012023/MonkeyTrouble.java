package codingbat._04012023;

public class MonkeyTrouble {
	public boolean monkey(boolean aSmile, boolean bSmile) {
		if (aSmile == bSmile) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		MonkeyTrouble ob = new MonkeyTrouble();

		System.out.println(ob.monkey(false, false));
		System.out.println(ob.monkey(false, true));
	}

}
