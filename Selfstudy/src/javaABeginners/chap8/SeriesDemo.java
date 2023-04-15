package javaABeginners.chap8;

//This interface is declared public so that it can be implemented by code in any package.
 interface Series {
	int getNext(); // return next number in series
	
	void reset();// restart

	void setStart(int x); // set starting value
}

//Implement Series.
class ByTwo implements Series {
	int start, val;

	ByTwo() {
		start = 0;
		val = 0;
	}

	public int getNext() {
		val += 2;
		return val;
	}

	public void reset() {
		val = start;
	}

	public void setStart(int x) {
		start = x;
		val = x;
	}
}

public class SeriesDemo {
	public static void main(String[] args) {
		ByTwo ob = new ByTwo();
		for(int i=0;i<5;i++) {
			System.out.println("Next value is " +
					ob.getNext());
		}
		
		
		System.out.println("\nResetting");
		
		ob.reset();
		for(int i=0;i<6;i++) {
			System.out.println("Next value is " +
					ob.getNext());
		}
		
		System.out.println("\nStarting at 100");
		ob.setStart(100);
		for(int i=0; i < 5; i++)
			System.out.println("Next value is " +
			ob.getNext());
	}
}
