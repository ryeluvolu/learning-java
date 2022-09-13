package control.flow;


public class IFElseIf {

	public static void main(String[] args) {
		int num1 = 10;

		if (num1 > 200) {
			System.out.println("In if block");
		}else if (num1 > 30) {
			System.out.println("In first else-if  block");	
		}else if (num1 >10) {
			System.out.println("In  second else-if  block");
		}else if (num1 >5) {
			System.out.println("In second else-if  block");
		}
		System.out.println("Execution completed!");
	}

}
