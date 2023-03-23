package javaABeginners.chap7;

class TwoDshape3 {
	private double width, height;

	// accessor method for width & height
	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	// -------------show how to access private member
	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}
//-----------------------

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}

class Triangle3 extends TwoDshape3 {
	String style;

	//constructor
	public Triangle3(String s, double w, double h) {
		setWidth(w);
		setHeight(h);
		style=s;
		
	}
	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle3 is " + style);
	}
}

public class Shapes3 {

	public static void main(String[] args) {
		Triangle3 t1 = new Triangle3("filled", 4.0, 4.0);
		Triangle3 t2 = new Triangle3("outlined", 8.0, 10.0);

		

		

		System.out.println("Info for t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("Area is " + t1.area());
		System.out.println();
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());

	}

}
