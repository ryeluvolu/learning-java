package streams.terminal;

import java.util.Optional;
import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;

public class Reduce {

	public static void main(String[] args) {
		Stream<Employee> employeeStream = EmployeesMock.getEmployeeObjects().stream();

		//Variation 1 of reduce method
		Optional<String> d = EmployeesMock.getEmployeeObjects().stream().map(emp -> emp.getName())
				.reduce((a, b) -> a +","+ b);
		System.out.println(d.get());

		//variation 2 of reduce method
		double salraySum = employeeStream.map(emp -> emp.getSalary()).reduce(0d, (a, b) -> a + b);
		System.out.println(salraySum);
		

	}

}
