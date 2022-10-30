package streams.terminal;

import java.util.Optional;
import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;

public class Min {

	public static void main(String[] args) {
		Stream<Employee> employeeStream = EmployeesMock.getEmployeeObjects().stream();
		Optional<Employee> youngestEmployee = employeeStream
				.min((emp1, emp2) -> Integer.valueOf(emp1.getAge()).compareTo(Integer.valueOf(emp2.getAge())));
		
		if (youngestEmployee.isPresent()) {
			System.out.println(youngestEmployee.get()+ ", " +youngestEmployee.get().getAge());
		}

	}

}
