package control.flow;

public class SwitchStatement {

	public static void main(String[] args) {
		int a = 10 ;
		String str = "A";
		
		switch(a) {
		case 1:
			a +=4;
			System.out.println(a);
			break;
		case 10:
			a +=4;
			System.out.println(a);
			break;
		case 12:
			System.out.println("In case 12");
			break;
		default:
			System.out.println("Default case is executed");
		}
		
		
		switch(str) {
		case "A":
			System.out.println("This is letter A");
			break;
		case "B":
			System.out.println("This is leter B");
			break;

		default:
			System.out.println("This is not a Alphabet");
		}
		System.out.println("Execution completed!");

	}

}
