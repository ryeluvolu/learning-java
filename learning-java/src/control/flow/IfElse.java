package control.flow;


public class IfElse {

	public static void main(String[] args) {
		int num1 = 60;
		
		if(num1 > 40) {
			//variable num5 is not visible out side of this if block
			int num5 = num1 * 2;
			System.out.println(num1);
			System.out.println(num5);
		}
		
		if(num1 > 20) {
			int num2 = num1 * 2;
			System.out.println(num1);
			System.out.println(num2);
		}else {
			System.out.println("Else block is executed!");
			int num2 = num1 * 5;
			System.out.println(num2);
		}
		System.out.println("Execution completed!");
	}

}
