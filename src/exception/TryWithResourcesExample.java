package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		Scanner scanner = null;

		// Regular try/catch
		
		try {
			scanner = new Scanner(new File("test.txt"));
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			// With regular try/catch we have to explicitly close the scanner in finally
			// block
			if (scanner != null) {
				scanner.close();
			}
		}
		

		// Try with resources : allows us to declare resources to be used in a try block
		// with the assurance that the resources will be closed after the execution of
		// that block

		
		try (Scanner scanner1 = new Scanner(new File("test.txt"))) {
			while (scanner1.hasNext()) {
				System.out.println(scanner1.nextLine());
			}

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}

}
