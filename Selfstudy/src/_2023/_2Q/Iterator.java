
package _2023._2Q;

import java.util.*;

public class Iterator {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		java.util.Iterator it=list.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
	}

}
