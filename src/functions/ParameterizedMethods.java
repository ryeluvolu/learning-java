package functions;

public class ParameterizedMethods {

	/**
	 * public static - is called access modifier 
	 * add - is the method name 
	 * int - is return type
	 * int a and int b - are formal parameters
	 */
	public static int add(int a, int b) {
		
		//Use  return keyword for the method to return a value
		return a+b; //It adds a and b and returns the value
	}
	public static void main(String[] args) {
		System.out.println(add(10,20));// 10 and 20 are actual parameters 
		System.out.println(add(60,20));
		System.out.println(add(50,40));
		System.out.println(add(10,60));
		System.out.println(add(16,70));
		System.out.println(add(10,70));

	}

}
