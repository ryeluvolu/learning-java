package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;

public class ParellelStream {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeesMock.getEmployeeObjects();
		Stream<Employee> employeeStream = employeeList.parallelStream();
		employeeStream.forEach(System.out::println);

		// Below code produces undesired results with parallel streams,so we need to
		// careful which operations can be run in parallel
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
		
		// Below line produces undesired results with parallel streams,so we need to
		// be careful which operations can be run in parallel
		int sum = numList.parallelStream().reduce(5, (a,b)-> a+b);
		System.out.println(sum);
		
		//Below code produces desired results with the parallel streams
		int sum1 = numList.parallelStream().reduce(0,Integer::sum)+5;
		System.out.println(sum1);
		

	}

}
