package inheritence;
/**
 * This is sub class or child class extends super class or parent class
 * 
 * In this example "Doctor" is subclass which extends super class "Person". So Doctor inherits
 * all the members of Person class, this is single inheritance in Java.
 */
public class Doctor extends Person {
	
	public void treat() {
		System.out.println("I can treat");
	}

}
