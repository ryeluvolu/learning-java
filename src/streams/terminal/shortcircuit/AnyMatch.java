package streams.terminal.shortcircuit;

import collections.EmployeesMock;

/**
 * This is a short circuit operation because the operation stops if any element
 * matches with the predicate
 * 
 * @author ryelu
 *
 */

public class AnyMatch {

	public static void main(String[] args) {

		System.out.println(EmployeesMock.getEmployeeObjects().stream().anyMatch(employee -> employee.getAge() > 65));

	}

}
