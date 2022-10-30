package streams.intermediate;

import java.util.List;
import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;

public class Sorted {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeesMock.getEmployeeObjects();
		System.out.println("Orginal list before sorting....... ");
		employeeList.forEach(emp-> System.out.println(emp));
		// Below sort operation, sorts the employee stream based on the natural order of
		// the employee name
		Stream<Employee> sortedEemployeeStream = employeeList.stream()
				.sorted((emp1, emp2) -> String.valueOf(emp1.getName()).compareTo(emp2.getName()));
		System.out.println("List after Sorted by name....... ");
		sortedEemployeeStream.forEach(emp -> System.out.println(emp));
	}

}
