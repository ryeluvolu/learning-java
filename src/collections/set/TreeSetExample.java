package collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import collections.EmployeeV2;
import collections.EmployeesMock;

public class TreeSetExample {

	public static void main(String[] args) {

		// Below commented code will run into an error(if you uncomment it) because
		// neither EmployeeV2 implements comparable interface nor we are passing
		// Comparator to the TreeSet constructor. TreeSet will work as List#sort or Collections#sort

		
		/* Set<EmployeeV2> employeeObjects = new TreeSet<>();
		 employeeObjects.addAll(EmployeesMock.getEmployeeV2Objects());
		 System.out.println(employeeObjects);
		 */
		 
		// We are passing NameComprator object to TreeSet constructor so that it can
		// sort elements based on logic in NameComprator#compare method
		Set<EmployeeV2> employeeObjectsSorted = new TreeSet<>(new NameComparator());
		employeeObjectsSorted.addAll(EmployeesMock.getEmployeeV2Objects());
		System.out.println(employeeObjectsSorted);

	}

}

//This is inner class : class inside a class is called inner class
class NameComparator implements Comparator<EmployeeV2> {

	@Override
	public int compare(EmployeeV2 emp1, EmployeeV2 emp2) {

		return emp1.getName().compareToIgnoreCase(emp2.getName());
	}

}
