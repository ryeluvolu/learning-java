package classes;

public class TraingleTest {

	public static void main(String[] args) {
		
		System.out.println(Triangle.numberOfSides());
		Triangle traingleA = new Triangle(4,5,7,4,6);
		Triangle traingleB = new Triangle(6,4,3,3,3);
		Triangle traingleC = traingleA;
		traingleA.base= 20;
		System.out.println("Not encapsulated" +findArea(traingleA.base,traingleA.height));
		
		System.out.println(traingleA.findArea());
		System.out.println(traingleB.findArea());
		System.out.println(traingleA.numberOfSides());
		System.out.println(traingleA.numberOfSides());
		

	}
	
	public static double findArea(double base , double height) {
		return (base * height) / 2;
	}

}
