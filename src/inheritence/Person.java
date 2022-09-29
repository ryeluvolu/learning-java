package inheritence;

/**
 * This is a super class or parent class 
 * @author ryelu
 *
 */

public class Person {
	
	private String name ;
	private int age ;
	
	public void sleep() {
		System.out.println(getName()+", is sleeping");
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
	
	

}
