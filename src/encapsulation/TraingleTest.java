package encapsulation;

public class TraingleTest {

	public static void main(String[] args) {
		
		System.out.println(Triangle.numberOfSides());
		Triangle traingleA = new Triangle(4,5);
		Triangle traingleB = new Triangle(6,4);
		
		traingleA.setBase(20);
		traingleA.setHeight(10);
		
		
		System.out.println(traingleA.findArea());
		System.out.println(traingleB.findArea());

	}
	
	public static double findArea(double base , double height) {
		//Local variable 
		//int i;
		//System.out.println(i);
		return (base * height) / 2;
		
	}

}
