package collections.set;

import java.util.HashSet;
import java.util.Set;

import collections.EmployeeV2;
import collections.EmployeesMock;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> employeeNamesSet =  new HashSet<>();
		
		System.out.println("Printing list of names");
		System.out.println(EmployeesMock.getEmployeeNames());
		//Adding list of employees to Set
		employeeNamesSet.addAll(EmployeesMock.getEmployeeNames());
		
		System.out.println("Printing set of names");
		//Duplicates names are eliminated but order is not guaranteed.
		System.out.println(employeeNamesSet);
		
		Set<EmployeeV2> employeeObjectsSet =  new HashSet<>();
		
		//HashSet eliminates duplicates objects but What makes two objects equal ?
		
		
		//If you want to treat two different EmployeeV2 objects as equal (for example if
		//you decided that two Employee's are the same if they have matching name variables),
		//you must override both the hashCode() and equals()methods inherited from class Object.
		
		employeeObjectsSet.addAll(EmployeesMock.getEmployeeV2Objects());
		
		System.out.println("Printing set of objects");
		System.out.println(employeeObjectsSet);

	}

}
