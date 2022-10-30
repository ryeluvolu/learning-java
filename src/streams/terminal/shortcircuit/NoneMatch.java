package streams.terminal.shortcircuit;

import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;

/**
 * This is a short circuit operation because the operation stops if at least one element 
 * matches with the predicate
 * 
 * @author ryelu
 *
 */

public class NoneMatch {

	public static void main(String[] args) {
		Stream<Employee> employeeStream = EmployeesMock.getEmployeeObjects().stream();
		System.out.println(employeeStream.noneMatch(employee -> employee.getAge() > 74));

	}

}
