package lambdas;

public class CalculateLambda {

	public static void main(String[] args) {
		/**
		 * This is an example of providing multiple implementations for custom
		 * functional interface "Calculate" using lambda expressions
		 */

		
		Calculate add = (x, y) -> x + y;
		System.out.println(add.cal(3, 4));

		Calculate sub = (int x, int y) -> x - y;
		System.out.println(sub.cal(7, 4));

		Calculate mult = (num1, num2) -> num1 * num2;
		System.out.println(mult.cal(7, 4));

	}

}
