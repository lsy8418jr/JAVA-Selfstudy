package _2023._2Q._05_08.pack1;

import _2023._2Q._05_08.pack2.*;

public class A {
	protected String pro_A="this is protected from A class";
	
	public static void main(String[] args) {
		C ob_C = new C();
		/*
		 * System.out.println(ob_C.default_C); cannot show because default modifier
		 */

		System.out.println(ob_C.public_C);
		
		
	}
}
