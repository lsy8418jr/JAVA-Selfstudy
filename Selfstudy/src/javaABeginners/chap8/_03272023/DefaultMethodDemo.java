package javaABeginners.chap8._03272023;

 interface MyIF {
	int getUserID();

	default int getAdminID() {
		return 1;
	}
}

class MyIFImp implements MyIF {
	public int getUserID() {
		return 100;
	}
}

public class DefaultMethodDemo {
	public static void main(String args[]) {
		MyIFImp ob= new MyIFImp();
		System.out.println("User ID is " + ob.getUserID());
		System.out.println("Administrator ID is " + ob.getAdminID());
	}
}
