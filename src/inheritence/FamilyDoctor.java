package inheritence;
/**
 * This is multilevel inheritance example
 *  FamilyDoctor extends Doctor and Doctor extends Person
 * @author ryelu
 *
 */

public class FamilyDoctor extends Doctor{
	
	public void houseCalls() {
		System.out.println("I can take house calls");
	}

}
