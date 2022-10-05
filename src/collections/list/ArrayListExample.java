package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// Declaring a variable of List of String types
		List<String> employeeNames;

		// Creating a instance of ArrayList of String types
		employeeNames =  new ArrayList<>();
		


		//Adding employee names to List of Strings
		employeeNames.add("Rama");
		employeeNames.add("Krishna");
		employeeNames.add("Yeluvolu");
		employeeNames.add("yeluvolu");
		employeeNames.add("Rama");

		
		// Operations on List
		System.out.println("Size of the list: " + employeeNames.size());
		System.out.println("Is my  list empty: " + employeeNames.isEmpty());
		//Get the elements from List using index 
		System.out.println("Employee Name at index 0 :" + employeeNames.get(0));
		System.out.println("Employee Name at index 1 :" + employeeNames.get(1));
		System.out.println("Employee Name at index 2 :" + employeeNames.get(2));
		
		System.out.println("Iterating ArrayList using enhanced for loop");
		//Iterate through ArrayList using for loop
		//Insert order is guaranteed  while iterating through the list
		for (String name : employeeNames ) {
			System.out.println(name);
		}
	}

}
