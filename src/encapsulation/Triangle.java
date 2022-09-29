package encapsulation;

/**
 * 
 * Encapsulation rule of thumb : Make instance variables private. Create setters
 * and getters to give access to the instance variables.
 */

public class Triangle {
	/**
	 * Instance variables are assigned values by default For example default value
	 * for "base" variable is 0.0
	 */
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;

	}

	/**
	 * Empty constructor : It has no parameters
	 */
	public Triangle() {

	}

	public double findArea() {
		return (base * height) / 2;
	}

	/**
	 * This is a getter method for base instance variable
	 */
	public double getBase() {
		return base;
	}

	/**
	 * This is a setter method for base instance variable
	 * 
	 * @param base
	 */
	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (!(height <= 0))
			this.height = height;
	}

}
