package codingbat._04152023;

public class BackAround {
	
	public static String backAround(String str) {
		  String frontback;
		  frontback=str.substring(str.length()-1);
		  return frontback+str+frontback;
	}

	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(backAround("Scot"));
		System.out.println(backAround("car"));
		System.out.println(backAround("a"));
		System.out.println(backAround("apple"));
		
		
	}
}
