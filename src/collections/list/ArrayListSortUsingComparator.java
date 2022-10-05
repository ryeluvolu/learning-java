package collections.list;

import java.util.Comparator;
import java.util.List;

import collections.EmployeeV2;
import collections.EmployeesMock;

public class ArrayListSortUsingComparator {

	public static void main(String[] args) {
		List<EmployeeV2> employeeObjects = EmployeesMock.getEmployeeV2Objects();

		// Sort by age using List.sort method
		employeeObjects.sort(new AgeComparator());
		System.out.println("Sort by age");
		System.out.println(employeeObjects);

		// Sort by name using Comparator created as argument-defined anonymous inner
		// classes

		employeeObjects.sort(new Comparator<EmployeeV2>() {

			@Override
			public int compare(EmployeeV2 o1, EmployeeV2 o2) {

				return o1.getName().compareTo(o2.getName());
			}

		});
		System.out.println("Sort by name");
		System.out.println(employeeObjects);

	}

}

//Inner class
class AgeComparator implements Comparator<EmployeeV2> {

	@Override
	public int compare(EmployeeV2 emp1, EmployeeV2 emp2) {

		return Integer.valueOf(emp1.getAge()).compareTo(Integer.valueOf(emp2.getAge()));
	}

}
