package _2023._2Q._06_28;

import java.util.*;

public class ArrayListToArray {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		System.out.println("Contents of al: " + al);

		Integer[] ia = new Integer[al.size()];
		ia = al.toArray(ia);
		int sum = 0;
		for (int i : ia) {
			sum += i;
		}
	//	for (int i = 0; i < ia.length; i++) {
	//		System.out.print(ia[i] + " ");
	//	}
		
		for(int a:ia) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("sum is " + sum);
	}

}
