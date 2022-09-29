package polymorphism;

public class PetOnwer {

	public static void main(String[] args) {

		Vet vet = new Vet();
	
		
		Animal dog1 = new Dog();
		Animal cat1 = new Cat ();
		Animal hippo = new Hippo();
		
		/**
		 * We can pass in 
		 */
		vet.giveShot(cat1);
		vet.giveShot(dog1);
		vet.giveShot(hippo);
		
		
		

	}

}
