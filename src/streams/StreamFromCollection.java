package streams;

import java.util.List;
import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;

/**
 * This example demonstrates, obtaining stream from Collections
 * This program does not produce any output because we have not used the stream.
 * @author ryelu
 *
 */

public class StreamFromCollection {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeesMock.getEmployeeObjects();
		Stream<Employee> employeeStream = employeeList.stream();

	}

}
