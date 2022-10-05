package generics;

/**
 * Some times you might want to write a method that takes variable number of arguments.
 * In Java there is a feature called variable length arguments or varargs for short
 * @author ryelu
 *
 */
public class VarArgs {

	public static void main(String[] args) {
		printNames("Rama","Krishna","Yeluvolu");
		printNames("Rama","Krishna");
		printNames("Rama");

	}
	
	public static void printNames(String... names ) {
		System.out.println("-----------------Printing Names--------------");
		for(String str: names) {
			System.out.println(str);
		}
	}

}
