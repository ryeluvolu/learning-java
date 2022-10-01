package exception;

public class UserDefinedExceptionTest {

	public static void main(String[] args) {
		
		try {
			//This division result into an exception
			division(1,0);
		} catch (UserDefinedException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws UserDefinedException
	 */
	public static int division(int a, int b) throws UserDefinedException {
		
		 int result=0;
		try {
			result = a/b;
		} catch (ArithmeticException e) {
			//Here we are catching arithmetic exception and throwing UserDefinedException
			throw new UserDefinedException("This is user defined exception");
		}
		return result;
		
	}

}
