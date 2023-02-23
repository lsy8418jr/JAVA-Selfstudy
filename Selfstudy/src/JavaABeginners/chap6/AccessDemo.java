package JavaABeginners.chap6;


 class MyClass{
	private int alpha;
	public int beta;
	int gamma;
	
	void setAlpha(int a) {
		this.alpha=a;
	}
	
	int getAlpha() {
		return alpha;
	}
}


public class AccessDemo {

	public static void main(String[] args) {

		MyClass ob=new MyClass();
		
		ob.setAlpha(99);
		System.out.println("ob.alpha is " + ob.getAlpha());
		
		// You cannot access alpha like this:
		//ob.alapha=10; -------------alpha is private value
	
	ob.beta=10;
	ob.gamma=20;
	
	
	}

}
