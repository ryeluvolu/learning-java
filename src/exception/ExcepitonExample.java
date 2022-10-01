package exception;

public class ExcepitonExample {

	public static void main(String[] args) {

		String str = null;

	
			// str1 is null and we are trying to access "substring" method on null str1,
			// results in to NullPointerException. We are catching general exception (Exception) and handling it .
			//Exception is super class for all exceptions so it can handle NullPointerException.
			try {
				String sub = str.substring(1);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		

		String str2 = null;
		try {
			// str2 is null and we are trying to access "substring" method on null str2,
			// results in to NullPointerException. We are catching specific exception (NullPointerException) and handling it .
			String sub = str2.substring(1);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointer exception");
		}

		String str3 = "Rama";
		try {
			char ch = str3.charAt(1);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Out of bound");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("I am not sure what happened!");
		} finally {
			System.out.println("Finally block is gaurented to be executed!");
		}

		System.out.println("I am reachable !");

	}

}
