package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic's is a way of telling complier what type of objects a collection can
 * contain.
 * 
 * I have 2 blocks of code and both blocks do the same thing. 
 * First blocks does this with out generic's. Second block does it with Generic's.
 * Generic's provides type safety. In this example complier checks only strings are
 * added to names2 list, which makes the code safer
 * 
 * If we uncomment line#32 , that does not use the generic's , we can actually
 * add integer to list of strings and complier does not complain.
 * However if we un comment same line under generic's example, we get compile time error.
 * 
 * With out generic's we need to cast every single object to a String when we need to access more elements from the list
 * With generic's we only need to specify the type once when we create a list.
 * 
 */
public class GenericExample {

	public static void main(String[] args) {

		// Example with out Generic's
		List names = new ArrayList();
		names.add("Rama");
		String name = (String) names.get(0);
		
		System.out.println("My name is " + name);
		names.add(1);

		// Example with out Generic's
		List<String> names2 = new ArrayList<String>();
		names2.add("Rama");
		String name2 = names2.get(0);
		System.out.println("My name is " + name);
		//name2.add(1);

	}

}
