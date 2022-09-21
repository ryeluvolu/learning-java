package functions;

public class ValueReturnMethod {

	public static String returnMyName() {
		//String name = "Rama";
		//return name;
		return "Rama";
	}
	public static void main(String[] args) {
		
		String name = returnMyName();
		
		System.out.println(name);
	}

}
