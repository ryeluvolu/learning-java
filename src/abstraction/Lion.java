package abstraction;

/**
 * Lion extends a abstract class and implements eat() and makeNoise()
 * @author ryelu
 *
 */
public class Lion extends Feline {

	@Override
	public void eat() {
		System.out.println("Lion is eating");
		
	}

	@Override
	public void makeNoise() {
		System.out.println("Roar");
		
	}

}
