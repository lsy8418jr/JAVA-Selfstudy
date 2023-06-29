package java_A_Beginners.chap7;

abstract class TwoDShape8 {
	private double width, height;
	private String name;

	TwoDShape8() {

		width = height = 0;
		name = "none";
	}

	TwoDShape8(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}

	TwoDShape8(double x, String n) {
		width = height = x;
		name = n;
	}

	TwoDShape8(TwoDShape8 ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
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

	String getName() {
		return name;
	}

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}

	// a method area() is abstract
	abstract double area();
}

class Triangle8 extends TwoDShape8 {
	private String style;

	Triangle8() {
		super();
		style = "none";
	}

	Triangle8(String s, double w, double h) {
		super(w, h, "triangle");
		style = s;
	}

	Triangle8(double x) {
		super(x, "triangle"); // call superclass constructor
		style = "filled";
	}

	Triangle8(Triangle8 ob) {
		super(ob); // pass object to its superclass (TwoDShape8)
	}

	// fill the method from its superclass' method
	double area() {
		return getWidth() * getHeight() / 2;
	}

}

class Rectangle8 extends TwoDShape8 {
	public Rectangle8() {
		super();
	}

	Rectangle8(double w, double h) {
		super(w, h, "rectangle"); // call superclass constructor
	}

	Rectangle8(double x) {
		super(x, "rectangle"); // call superclass constructor
	}

	Rectangle8(Rectangle8 ob) {
		super(ob); // pass object to TwoDShape constructor
	}

	boolean isSquare() {
		if (getWidth() == getHeight())
			return true;
		return false;
	}

	double area() {
		return getWidth() * getHeight();
	}
}

public class AbsShape {
	public static void main(String[] args) {
		TwoDShape8 shapes[] = new Rectangle8[4];
		shapes[0] = new Triangle8("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle8(10);
		shapes[2] = new Rectangle8(10, 4);
		shapes[3] = new Triangle8(7.0);

		for (int i = 0; i < shapes.length; i++) {
			System.out.println("object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			System.out.println();
		}

	}
}
