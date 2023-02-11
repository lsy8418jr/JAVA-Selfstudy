import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
	public static void main(String args[]) {
		ArrayList arr = new ArrayList(10);

		arr.add(new Integer(3));
//	=arr.add(3); autoboxing

		arr.add(new Integer(2));
		arr.add(new Integer(32));
		arr.add(new Integer(34));
		arr.add(new Integer(6));

		ArrayList arr2 = new ArrayList(arr.subList(1, 4)); // 1<=arr2 <4

		System.out.println("arr list : " + arr);
		System.out.println("arr2 :" + arr2);
		System.out.println();

		Collections.sort(arr);
		System.out.println("array sort : " + arr);   // sort list
		System.out.println();
		
		arr2.add("A");
		arr2.add("b");
		arr2.add("c");
		
		System.out.println("arr2 added abc : "+arr2);
		System.out.println();
		
		arr2.set(3, "AA");
		System.out.println("arr2 altered  : "+arr2);
		System.out.println();
		
		

	}
}
