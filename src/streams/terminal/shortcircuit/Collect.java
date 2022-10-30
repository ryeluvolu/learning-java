package streams.terminal.shortcircuit;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;

public class Collect {

	public static void main(String[] args) {
		Stream<Employee> employeeStream = EmployeesMock.getEmployeeObjects().stream();
		List<Employee> filteredList = employeeStream.filter(employee -> employee.getAge() > 39)
				.collect(Collectors.toList());
		
		filteredList.forEach(employee -> System.out.println(employee.getAge()));
		
	}

}
