package _2023._2Q._04_21;

public class StringMethod {
public static void main(String[] args) {
	String name="Scott";
	System.out.println(name.equals("Scott"));
	System.out.println(name.equalsIgnoreCase("scott"));
	System.out.println(name.charAt(0));
	System.out.println(name.indexOf('c'));
	System.out.println(name.toUpperCase());
	System.out.println(name.replace("c", "a"));
	
	String name2="   Scott     ";
	System.out.println(name2.trim());
}
}
