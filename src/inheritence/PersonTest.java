package inheritence;

public class PersonTest {

	public static void main(String[] args) {
		Doctor d = new Doctor();
		d.setAge(35);
		d.setName("Rama");
		d.sleep();
		d.treat();
		Actor a = new Actor();
		a.setAge(35);
		a.setName("Krishna");
		a.sleep();
		a.act();
		Surgeon s = new Surgeon ();
		s.setAge(35);
		s.setName("Vamsi");
		s.operations();

	}

}
