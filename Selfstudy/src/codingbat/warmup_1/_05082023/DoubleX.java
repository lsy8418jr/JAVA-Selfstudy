package codingbat.warmup_1._05082023;

public class DoubleX {
	boolean doubleX(String str) {
		int i = str.indexOf('x');

		if (str.length() < 2)
			return false;

		else if (i <= str.length() - 2) {
			if (str.charAt(i + 1) == 'x')
				return true;
			else
				return false;
		}

		else
			return false;

	}
}
