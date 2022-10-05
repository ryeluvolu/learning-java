package collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import collections.Employee;
import collections.EmployeesMock;

/**
 * A map contains values on the basis of key, i.e. key and value pair. A Map is
 * useful if you have to search, update or delete elements on the basis of a key.
 */
public class HashMapExample {

	public static void main(String[] args) {
		Map<String, String> namesMap = new HashMap<>();
		namesMap.put("1", "Rama");
		namesMap.put("2", "Krishna");
		namesMap.put("3", "Yeluvolu");
		// Map accepts duplicate objects
		namesMap.put("4", "Rama");
		// Map accepts one null value as a key
		namesMap.put(null, "Null value");

		// Map does not accept null as a value.
		// If we uncomment below complier will show an error.
		// namesMap.put(5, null);

		// Iterate through map values and print it
		for (String value : namesMap.values()) {
			System.out.println(value);
		}

		// Get value from map using key
		String name = namesMap.get("2");
		System.out.println(name);

		// Iterate through key set, print keys and values
		for (String key : namesMap.keySet()) {
			System.out.println(key + ":" + namesMap.get(key));
		}

		// Creating a map which takes Integer as a key and Employee as a value
		Map<Integer, Employee> employeeMap = new HashMap<>();

		// Get the list of employees using EmployeeMock
		List<Employee> list = EmployeesMock.getEmployeeObjects();

		// Iterate though the list of Employee objects and put it into map. Use list
		// index as a key to the map
		for (int i = 0; i < list.size(); i++) {
			employeeMap.put(i, list.get(i));
		}

		System.out.println("---------------Iterating through employee objects and print the employee name------------");
		// Iterating through employee map and print the employee name
		for (Employee employee : employeeMap.values()) {
			System.out.println(employee.getName());
		}

	}

}
