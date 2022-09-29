package encapsulation;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("Rama");
		String str2 = str1;
		String str3 = new String("Rama");
		//== checks if references are the same 
		System.out.println(" str1 == str2 :" + (str1 == str2)); // this is true
		System.out.println(" str1 == str3 :" + (str1== str3)); // this is false
		// .equals checks if the value in the object matches
		System.out.println(" str3.equals(str1) :"+ str3.equals(str1)); // this is true
	
	}

}
