package _2023._06_28;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");

		System.out.println("buffer= " + sb);
		System.out.println("length= " + sb.length());
		System.out.println("capacity= " + sb.capacity());

		/*
		 * Its capacity is 21 because
		 *  room for 16 additional characters 
		 *  is automatically added
		 */
	}
}
