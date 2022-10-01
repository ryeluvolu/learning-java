package arrays;

/**
 * Array is a container that holds a fixed number of values of a single type.
 * Array length is fixed after its created.
 * Each item in Array called an element, and each element is accessed by its numerical index.
 *
 * @author ryelu
 *
 */
public class ArrayExample {

	public static void main(String[] args) {
		
		//Declare an int array
		int[] intArray;
		
		//Creates an array for 3 integers
		intArray = new int[3];
		
		intArray[0]= 100; // Initialize first element
		intArray[1]= 200;
		intArray[2]= 300;
		intArray[3]= 400; // This will throw a runtime exception 
		
		// Declaring , creating and initializing array, all in one statement 
		int[] intArray1 = {400,500,600};
		
		//Iterate Array 
		for (int i=0 ; i < intArray.length;i++) {
			System.out.println("Element at index: "+i+" :"+intArray[i]);
		}
		
		for(int i : intArray1 ) {
			System.out.println(i);
		}
		
		//String Array
		String[] strArray = {"Rama","Krishna","Yeluvolu"};
		
		//Enhanced for loop - introduced in Java5
		for (String str: strArray) {
			System.out.println(str);
		}
		

	}

}
