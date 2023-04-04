package codingbat.warmup_1._04042023;

public class Make10 {
	public static boolean makes10(int a, int b) {
		  if (a==10 || b==10){
		    return true;
		  }
		  else if (a+b==10){
		    return true;
		  }
		  else 
		  return false;
		}

	public static void main(String[] args) {
System.out.println(makes10(9, 10));
System.out.println(makes10(9, 9));
System.out.println(makes10(9, 1));
System.out.println(makes10(10, 10));
System.out.println(makes10(13,-3));

	}

}
