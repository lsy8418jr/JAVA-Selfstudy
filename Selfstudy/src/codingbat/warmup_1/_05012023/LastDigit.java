package codingbat.warmup_1._05012023;

public class LastDigit {
	public boolean lastDigit(int a, int b) {
		int newA = a % 10;
		int newB = b % 10; 

		if (newA == newB) {
			return true;
		} else
			return false;
	}
}
