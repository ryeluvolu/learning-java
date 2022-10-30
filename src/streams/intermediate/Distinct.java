package streams.intermediate;

import java.util.List;

import collections.EmployeeV2;
import collections.EmployeesMock;

public class Distinct {

	public static void main(String[] args) {
		List<EmployeeV2> employeeV2List = EmployeesMock.getEmployeeV2Objects();
		System.out.println("Orginal Employee List...........");
		employeeV2List.forEach(emp -> System.out.println(emp));
		System.out.println("Distinct Employee List...........");
		// Below distinct operation returns a new stream of distinct elements by
		// comparing objects equals method
		employeeV2List.stream().distinct().forEach(System.out::println);

	}

}
