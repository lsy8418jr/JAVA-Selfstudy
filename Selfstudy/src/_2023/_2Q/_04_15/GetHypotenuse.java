package _2023._2Q._04_15;

import java.util.Scanner;

public class GetHypotenuse {

	public static void main(String[] args) {
		double a,b,c;
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter side a : ");
		a=input.nextDouble();
		System.out.print("enter side b : ");
		b=input.nextDouble();
		
		c= Math.sqrt((a*a)+(b*b));
		
		System.out.println("the hypotenuse is "+c);
		
	}
	
	
}
