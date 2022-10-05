package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class PetOnwer {

	public static void main(String[] args) {

		Vet vet = new Vet();

		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal hippo = new Hippo();

		List<Animal> animalList = new ArrayList<>();

		animalList.add(cat);
		animalList.add(dog);
		animalList.add(hippo);

		System.out.println("Using non wildcard method to pass in animal list");
		vet.giveShotNonWildcardMethod(animalList);

		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();

		List<Dog> dogList = new ArrayList<>();
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);

		// Complier does not allow to pass in dog list in place of animal list.
		// vet.giveShotNonWildcardMethod(dogList);// Complier throw an error if we uncomment this line

		// giveShotWildcardMethod  accepts both animal list and dog list

		System.out.println("Using wildcard method to pass in animal list");
		vet.giveShotWildcardMethod(animalList);

		System.out.println("Using  wildcard method to pass in dog list");
		vet.giveShotWildcardMethod(dogList);

	}

}
