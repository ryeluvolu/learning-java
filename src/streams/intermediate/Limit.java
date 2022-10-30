package streams.intermediate;

import java.util.List;

import collections.Employee;
import collections.EmployeesMock;

public class Limit {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeesMock.getEmployeeObjects();
		// Below limit operation returns a new stream contains a specified number of
		// elements
		employeeList.stream().limit(2).forEach(System.out::println);

	}

}
