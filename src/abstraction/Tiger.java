package abstraction;

/**
 * Tiger extends a abstract class and implements eat() and makeNoise()
 * @author ryelu
 *
 */
public class Tiger extends Feline {

	@Override
	public void eat() {
		System.out.println("Tiger is eating");
		
	}

	@Override
	public void makeNoise() {
		System.out.println("Chuff");
		
	}

}
