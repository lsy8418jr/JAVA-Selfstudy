package java_A_Beginners._07_Inheritance;

class TwoDShape7 {
	private double width, height;

	TwoDShape7() {
		width = height = 0;
	}

	TwoDShape7(double w, double h) {
		width = w;
		height = h;
	}

	TwoDShape7(double x) {
		width = height = x;
	}

	TwoDShape7(TwoDShape7 ob) {
		width = ob.width;
		height = ob.height;
	}

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}

}

class Triangle7 extends TwoDShape7 {
	private String style;

	Triangle7() {
		super();
		style = "none";
	}

	Triangle7(String s, double w, double h) {
		super(w, h);
		style = s;
	}

	Triangle7(double x) {
		super(x); // call superclass constructor
		style = "filled";
	}

	Triangle7(Triangle7 ob) {
		super(ob); // pass object to TwoDShape7 constructor
		style = ob.style;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle7 is " + style);
	}

}

public class Shapes7 {
	public static void main(String[] args) {
		Triangle7 t1 = new Triangle7("outlined", 8.0, 12.0);
		Triangle7 t2 = new Triangle7(t1);

		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		System.out.println("\n");
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());

	}
}
