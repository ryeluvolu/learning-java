package abstraction;

public class Dog extends Canine implements Pet {

	@Override
	public void eat() {
		System.out.println("I eat like a dog");
		
	}

	@Override
	public void makeNoise() {
		System.out.println("BOW BOW");
		
	}

	@Override
	public void frinedly() {
		System.out.println("Dogs are loyal and friendly!");
		
	}

	@Override
	public void someThingSpecficCanine() {
		System.out.println(" This is Canine specifc behaviour");
		
	}

}
