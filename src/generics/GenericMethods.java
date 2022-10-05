package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic methods in Java , a method that allows you to create a new type
 * parameter for that method. This is useful when you are writing a method but
 * want to be flexible about the type of objects you can pass in.
 * 
 * @author ryelu
 *
 */
public class GenericMethods {

	static Character[] charArray = { 'R', 'A', 'M', 'A' };
	static Integer[] integerArray = { 1, 2, 3, 4, 5 };
	static Boolean[] booleanArray = { true, false, true, false };
	/**
	 * This is how non generic method works and its flexible about the type of objects
	 * we can pass in but this approach has issues. 
	 * 
	 */
	public static List arrayToList(Object[] array, List<Object> arrayList) {

		for (Object obj : array) {
			arrayList.add(obj);
		}
		return arrayList;

	}
	
	/**
	 * This is Generic Method
	 * Since T is a generic type, it does not matter what type we use as long as same type every time we use
	 * 
	 */
	public static <T> List<T> genericArrayToList(T[] array, List<T> arrayList) {

		for (T obj : array) {
			arrayList.add(obj);
		}
		return arrayList;

	}

	public static void main(String[] args) {
		List<Character> charList = arrayToList(charArray, new ArrayList<>());
		List<Boolean> booleanList = arrayToList(booleanArray, new ArrayList<>());
		List<Integer> integerList = arrayToList(integerArray, new ArrayList<>());
		
		//Complier does not show any error's , if we uncomment below 2 lines but we get
		 //ClassCastException at runtime. Solution is generic method
		
		//List<String> integerList2 = arrayToList(integerArray, new ArrayList<>());
		//System.out.println(integerList2.get(0));
		
		//This block uses generic method
		List<Character> charList1 = genericArrayToList(charArray, new ArrayList<Character>());
		List<Boolean> booleanList1 = genericArrayToList(booleanArray, new ArrayList<Boolean>());
		List<Integer> integerList1= genericArrayToList(integerArray, new ArrayList<Integer>());
		
		//If we uncomment below line complier shows an error. So we can discover errors much earlier on 
		//List<String> integerList3 = genericArrayToList(integerArray, new ArrayList<>());
		

	}

	

}
