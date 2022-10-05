package collections.map;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import collections.EmployeeV2;
import collections.EmployeesMock;

public class TreeMapExample {

	public static void main(String[] args) {
		// TreeMap uses key to sort the objects, so all keys inserted into map either
		// must implement Comparable or we have provide Comparator implementation to
		// TreeMap constructor. Most of the time we use primitives(like int) or its
		// Wrapper classes(like Integer) or Strings as keys, so we do not need to
		// implement Comparator. Use TestComparator just to show as example but not
		// needed unless your key is some type of object the does not implement
		// Comparable

		// Creating a map which takes Integer as a key and EmployeeV2 as a value
		Map<Integer, EmployeeV2> employeeV2TreeMap = new TreeMap<Integer, EmployeeV2>(new TestComparator());

		// Get the list of employees using EmployeeMock
		List<EmployeeV2> list = EmployeesMock.getEmployeeV2Objects();

		// Iterate though the list of EmployeeV2 objects and put it into map. Use list
		// index as a key to the map
		for (int i = 0; i < list.size(); i++) {
			employeeV2TreeMap.put(i, list.get(i));
		}

		System.out.println("---------------Iterating through EmployeeV2 and print the employee name------------");
		// Iterating through employee map and print the employee name
		for (EmployeeV2 employee : employeeV2TreeMap.values()) {
			System.out.println(employee.getName());
		}

	}

}

class TestComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o1.compareTo(o2);
	}

}
