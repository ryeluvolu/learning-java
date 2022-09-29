package debug;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Lets  calculate the area of a triangle");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input base of a triangle(in inches.)");
		double  base = scanner.nextDouble();
		while (base <=0) {
			System.out.println("That's invalid. Please input base of a triangle(in inches). ");
			base = scanner.nextDouble();
		}
		
		System.out.println("Please input height of a triangle(in inches).");
		double height = scanner.nextDouble();
		
		while (height <=0) {
			System.out.println("That's invalid. Please input height of a triangle(in inches). ");
			height = scanner.nextDouble();
		}
		
		double area = (base * height)/2;
		System.out.println("Area of triangle is: " + area);
		

	}

}
