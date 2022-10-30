package streams.terminal;

import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;

public class Count {

	public static void main(String[] args) {
		Stream<Employee> employeeStream = EmployeesMock.getEmployeeObjects().stream();
		long count = employeeStream.filter(employee -> employee.getAge() > 35).count();
		System.out.println("Filtered employee count: "+count);
		
	}

}
