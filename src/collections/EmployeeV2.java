package collections;


public class EmployeeV2 {

	private String name;
	private int age;
	private double salary;

	public EmployeeV2(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	//If you want to treat two different EmployeeV2 objects as equal (for example if
	//you decided that two EmployeeV2's are the same if they have matching name variables),
	//you must override both the hashCode() and equals() methods inherited from class Object.

	@Override
	public int hashCode() {	
		return getName().toUpperCase().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		EmployeeV2 emp = (EmployeeV2)obj;
		return getName().toUpperCase().equals(emp.getName().toUpperCase());
	}
	

}
