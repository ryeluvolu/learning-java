package generics.wildcards;

public class Animal {
	private String name ;
	private int age ;
	private int lifeExpentcy ;
	
	public void makeSound() {
		System.out.println("Making sound");
	}
	
	public void sleep() {
		System.out.println("I am sleeping");
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

	public int getLifeExpentcy() {
		return lifeExpentcy;
	}

	public void setLifeExpentcy(int lifeExpentcy) {
		this.lifeExpentcy = lifeExpentcy;
	}

}
