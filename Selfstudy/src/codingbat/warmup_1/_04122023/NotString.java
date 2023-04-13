package codingbat.warmup_1._04122023;

public class NotString {
	public static String notString(String str) {
		  if(str.length()>=3 && str.substring(0,3).equals("not")){
		    return str;
		    
		  }
		  else{
		    return "not "+str;
		  }
		}
public static void main(String[] args) {
	System.out.println(notString("x") );
	System.out.println(notString("is not"));
	System.out.println();
	System.out.println(notString("not mine"));
}

}
