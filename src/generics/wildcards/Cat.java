package generics.wildcards;

public class Cat extends Animal {
	
	/**
	 * Method overriding 
	 * In this example Cat class is overriding a method from its super class "Animal".
	 */
	
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}

}
