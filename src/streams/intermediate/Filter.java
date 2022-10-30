package streams.intermediate;

import java.util.List;

import collections.Employee;
import collections.EmployeesMock;

public class Filter {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeesMock.getEmployeeObjects();
		System.out.println("Orginal employee count: "+employeeList.size());
		long employeeCount = employeeList.stream().filter(emp -> emp.getSalary() > 6000).count();
		System.out.println("Filtered  employee count: "+employeeCount);
		
		System.out.println("Orginal employee count: "+employeeList.size());
		
	}

}
