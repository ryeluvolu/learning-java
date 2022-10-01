package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {

		try {
			// Reading content from file by passing local directory paths
			// This file does not exist in the location
			// This constructor FileInputStream
			// throws FileNotFoundException which is a checked exception.
			// main method is forced to handle this checked exception 
			// by surrounding it with try/catch
			// if we remove try/catch then program does not complain.
			FileInputStream file = new FileInputStream("somefile.txt");
			System.out.println("file was found");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			
		}
		System.out.println("I am rechable");

	}

}
