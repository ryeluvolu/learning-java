package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 > 5 && num2 > 15); //true && true = true
		System.out.println(num1 > 15 && num2 > 25); //false && false  false
		
		System.out.println(num1 > 15 || num2 > 15); //false OR true
	}

}
