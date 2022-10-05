package generics.wildcards;

import java.util.List;

public class Vet {

	/**
	 * This is non wildcard method that does not allow to pass in list of Dog
	 * objects into list of Animal objects.If complier allows to substitute list of
	 * Animal with list of Dog's then we can accidently put a Cat object into Dog
	 * list. For example, something like animals.add(new Cat()), where animals
	 * supposed to be list of Dog's.
	 * 
	 * Solution is wildcard methods
	 * 
	 * @param animals
	 */
	public void giveShotNonWildcardMethod(List<Animal> animals) {
		// Give a shot
		for (Animal animal : animals) {
			animal.makeSound();

		}

	}

	/**
	 * This is a wildcard method that allows to pass in list of Dog objects into list
	 * of Animal's and it prevents us from adding Cat object to Dog list. For
	 * example, compiler throw an error if we were to do animals.add(new Dog()),
	 * since it does not know what element type animals stands for.
	 * 
	 * @param animals
	 */

	public void giveShotWildcardMethod(List<? extends Animal> animals) {
		for (Animal animal : animals) {
			animal.makeSound();
		}

	}

}
