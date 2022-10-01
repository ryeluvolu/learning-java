package abstraction;

public abstract class Canine implements Animal{
	
	@Override
	public void roam() {
		System.out.println("We roam in groups");
	}
	/**
	 * This method does not have a body and it called abstract method
	 * 
	 */
	public abstract void someThingSpecficCanine();

}
