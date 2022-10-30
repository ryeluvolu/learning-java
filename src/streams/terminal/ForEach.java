package streams.terminal;

import java.util.List;
import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;
/**
 * This example demonstrates forEach Terminal Operation
 * @author ryelu
 *
 */

public class ForEach {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeesMock.getEmployeeObjects();
		Stream<Employee> employeeStream = employeeList.stream();
		
		System.out.println("...............Non Stream version of for each...............");
		//Non stream version of for loop
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		System.out.println("...............Stream version of for each...............");
		//Stream version of forEach
		employeeStream.forEach(System.out::println);
		
		// Un-commenting below will run into IllegalStateException, stream has already
		// been operate upon or closed. Because we are only allowed to perform a single
		// operation that consumes the stream.
		
		// employeeStream.forEach(employee -> System.out.println(employee));

	}

}
