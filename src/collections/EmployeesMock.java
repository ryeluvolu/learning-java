package collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeesMock {
	
	public static List<Employee> getEmployeeObjects(){
		//Declaring a variable of generic type
		List<Employee> employeeObjects;
		
		//Creating a instance of generic class and assigning it a variable 
		employeeObjects= new ArrayList<>();
		
		//Creating employee mock objects
		Employee emp1 = new Employee("Rama",42,5689.40);
		Employee emp2 = new Employee("Krishna",35,6789.40);
		Employee emp3 = new Employee("Yeluvolu",39,8689.40);
		Employee emp4 = new Employee("yeluvolu",39,8689.40);
		Employee emp5 = new Employee("Rama",42,5689.40);
		
		//Adding employee objects to ArrayList
		employeeObjects.add(emp1);
		employeeObjects.add(emp2);
		employeeObjects.add(emp3);
		employeeObjects.add(emp4);
		employeeObjects.add(emp5);
		
		return employeeObjects;
	}
	
	public static List<String> getEmployeeNames(){
		List<String> employeeNames = new ArrayList<>();
		employeeNames.add("Rama");
		employeeNames.add("Krishna");
		employeeNames.add("Yeluvolu");
		employeeNames.add("yeluvolu");
		employeeNames.add("Rama");
		return employeeNames;
	}
	
	
	public static List<EmployeeV2> getEmployeeV2Objects(){
		List<EmployeeV2> employeeObjects;
		
		employeeObjects= new ArrayList<>();
		
		//Creating EmployeeV2 mock objects
		EmployeeV2 emp1 = new EmployeeV2("Rama",42,5689.40);
		EmployeeV2 emp2 = new EmployeeV2("Krishna",40,6789.40);
		EmployeeV2 emp3 = new EmployeeV2("Yeluvolu",39,8689.40);
		EmployeeV2 emp4 = new EmployeeV2("yeluvolu",39,8689.40);
		EmployeeV2 emp5 = new EmployeeV2("Rama",42,5689.40);
		
		//Adding employeeV2 objects to ArrayList
		employeeObjects.add(emp1);
		employeeObjects.add(emp2);
		employeeObjects.add(emp3);
		employeeObjects.add(emp4);
		employeeObjects.add(emp5);
		
		return employeeObjects;
	}
	
	
}
