package codingbat.warmup_1._04182023;

public class In1020 {
	public static boolean in1020(int a, int b) {
	if((a>=10 && a<=20)||(b>=10 && b<=20)	)  {
		return true;
	}
	else
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(in1020(22, 15));
		System.out.println(in1020(12, 99));
		System.out.println(in1020(8, 99));
		System.out.println(in1020(10, 20));
		System.out.println(in1020(1, 15));
			
	}
}
