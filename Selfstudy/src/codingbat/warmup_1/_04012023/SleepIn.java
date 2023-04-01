package codingbat.warmup_1._04012023;

public class SleepIn {
	boolean sleepIn(boolean weekday, boolean vacation) {
		if (weekday == false || vacation == true) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		SleepIn ob = new SleepIn();
		System.out.println(ob.sleepIn(true, false));
		System.out.println(ob.sleepIn(false, false));
		System.out.println(ob.sleepIn(true, true));
		System.out.println(ob.sleepIn(false, true));

	}
}
