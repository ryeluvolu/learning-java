package abstraction;

public class Cat extends Feline implements Pet {

	@Override
	public void eat() {
		System.out.println("I drink milk");
		
	}

	@Override
	public void makeNoise() {
		System.out.println("Meow");
		
	}

	@Override
	public void frinedly() {
		System.out.println("Cats are friendly!");
		
	}

}
