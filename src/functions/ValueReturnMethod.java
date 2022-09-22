package functions;

public class ValueReturnMethod {

	// This method returns String as a value
	public static String returnMyName() {
		// String name = "Rama";
		// return name;
		return "Rama";
	}

	public static void main(String[] args) {

		String name = returnMyName();
		System.out.println(name);

		// Line# 19 equivalent to line#14 and #15. Preferred coding practice is line#19
		// because its less lines of code.
		System.out.println(returnMyName());
	}

}
