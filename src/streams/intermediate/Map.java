package streams.intermediate;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import collections.Employee;
import collections.EmployeesMock;

public class Map {
	public static void main(String[] args) {
		List<Employee> employeeList = EmployeesMock.getEmployeeObjects();
		//Below map operation transforms stream of employee elements to the stream of Integer elements 
		Stream<Integer> ageStream= employeeList.stream().map(emp -> emp.getAge());
		ageStream.forEach(age -> System.out.println (age));
		
		System.out.println("Priting IntStream...................");
		//Below map operation transforms stream of employee elements to IntStream
		IntStream intAgeStream = employeeList.stream().mapToInt(emp -> emp.getAge());
		intAgeStream.forEach(System.out::println);
		
		System.out.println("Priting DoubleStream...................");
		//Below map operation transforms stream of employee elements to DoubleStream
		DoubleStream doubleAgeStream = employeeList.stream().mapToDouble(emp -> emp.getSalary());
		doubleAgeStream.forEach(System.out::println);
		
		System.out.println("Priting LongStream...................");
		//Below map operation transforms stream of employee elements to LongStream
		LongStream longAgeStream = employeeList.stream().mapToLong(emp -> emp.getAge());
		longAgeStream.forEach(System.out::println);
		
	}

}
