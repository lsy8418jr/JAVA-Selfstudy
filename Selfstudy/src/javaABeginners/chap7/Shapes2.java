package javaABeginners.chap7;

/*
 * --------
 * practice member declared as private in extends class
 * 
 * 
 * class TwoDShape{
	private double width, height;
	void showDim() {
		System.out.println("Width and height are " +
				width + " and " + height);
				}
				}
				
				
				----------- A subclass of TwoDShape for triangles.
				
				
				class Triangle extends TwoDShape {
				String style;
				
				double area() {
				return width * height / 2;  ----------------------------- Error! can't access (width and height)
				}
				void showStyle() {
				System.out.println("Triangle is " + style);
	}
}

--------------Here is a solution
*/

class TwoDshape2 {
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

class Triangle2 extends TwoDshape2 {
	String style;

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle2 is " + style);
	}
}

public class Shapes2 {

	public static void main(String[] args) {
		Triangle2 t1 = new Triangle2();
		Triangle2 t2 = new Triangle2();

		t1.setHeight(4.0);
		t1.setWidth(4.0);
		t1.style = "filled";

		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "outlined";

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
