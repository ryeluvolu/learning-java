package abstraction;

public class AbstractionTest {

	public static void main(String[] args) {
		Pet[] pets = {new Dog(),new Cat()};
		
		Animal [] animals = {new Dog(),new Cat(), new Tiger(), new Lion()};
		
		for (Pet p : pets) {
			p.frinedly();
		}
		System.out.println("--------------------------------------------");
		for (Animal animal : animals) {
			animal.makeNoise();
			animal.eat();
			animal.roam();
			System.out.println("--------------------------------------------");
		}
	}

}
