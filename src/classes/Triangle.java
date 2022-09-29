package classes;

public class Triangle {
	// Attributes
	double base;
	double height;
	double side1;
	double side2;
	double side3;
	// Static variable
	static int NUMBER_OF_SIDES = 3;

	public Triangle(double base, double height, double side1, double side2, double side3) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	// Behaviour : which is going to use attributes to calculate area of a triangle
	public double findArea() {
		return (base * height) / 2;
	}

	// Static method
	public static int numberOfSides() {
		return NUMBER_OF_SIDES;
	}

}
