package collections.list;

import java.util.Collections;
import java.util.List;

import collections.Employee;
import collections.EmployeesMock;

public class ArrayListSortUsingComparable {

	public static void main(String[] args) {

		List<String> employeeNames = EmployeesMock.getEmployeeNames();
		employeeNames.toString();
		
		System.out.println("Printing Employee names beofre sorting ");
		System.out.println(employeeNames);

		// Collections is a java.util package class, consists of several static
		// methods,which operates on collections
		// Below we are calling Collections sort method to operate on employeeNames collection
		// and sorts employee names
		Collections.sort(employeeNames);

		System.out.println("Printing Employee names after sorting ");
		System.out.println(employeeNames);

		List<Employee> employeeObjects = EmployeesMock.getEmployeeObjects();

		System.out.println("Printing Employee objects before sorting ");
		System.out.println(employeeObjects);

		
		Collections.sort(employeeObjects);
		 
		 System.out.println("Printing Employee objects after sorting ");
		 System.out.println(employeeObjects);
		

	}

}
