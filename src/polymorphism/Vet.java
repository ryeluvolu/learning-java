package polymorphism;

public class Vet {

	/**
	 * Polymorphic arguments 
	 * giveShot method accepts any object which is type of
	 * Animal, For example dog, cat
	 */
	public void giveShot(Animal animal) {
		// Give a shot
		/**
		 * animal.makeSoound() method has different forms based on the context its used
		 * For example, 
		 * "animal" takes form of Dog and invokes makeSound() method on Dog
		 * object when animal variable pointing to Dog's object reference.
		 * 
		 * "animal" takes form of Cat and invokes makeSound() method on Cat object when animal variable
		 * pointing to Cat's object reference
		 */
		animal.makeSound();

	}

}
