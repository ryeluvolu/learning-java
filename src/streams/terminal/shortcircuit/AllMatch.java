package streams.terminal.shortcircuit;

import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;

/**
 * This is a short circuit operation because the operation stops if any element
 * does not match with the predicate
 * 
 * @author ryelu
 *
 */

public class AllMatch {

	public static void main(String[] args) {
		Stream<Employee> employeeStream = EmployeesMock.getEmployeeObjects().stream();
		System.out.println(employeeStream.allMatch(employee -> employee.getAge() > 34));

	}

}
