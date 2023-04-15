package codingbat.warmup_1._04152023;

public class Or35 {
	public static boolean or35(int n) {
		if (n % 5 == 0 || n % 3 == 0) {
			return true;

		} else
			return false;
	}

	public static void main(String[] args) {


	System.out.println("Number is 15 "+or35(15));
	System.out.println("Number is 13 "+or35(13));
	System.out.println("Number is 11 "+or35(11));
	System.out.println("Number is 5  " + or35(5));
	System.out.println("Number is 33 "+or35(33));
	System.out.println("Number is 21 "+or35(21));
	                                       
	
	
	}
}
