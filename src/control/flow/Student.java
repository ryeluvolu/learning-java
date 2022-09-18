package control.flow;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int studentAge = 35;
		double studentGPA = 4.5;
		String studentFirstName = "Rama";
		String studentFirstName2 = "rama";
		String studentLastName = "Yeluvolu";
		char studentFirstInitial = studentFirstName.charAt(3);
		char studentLastInitial = studentLastName.charAt(0);

		boolean studentHadPerfectAttendence = true;
		System.out.println(studentAge);
		System.out.println(studentHadPerfectAttendence);
		System.out.println(studentFirstName);
		System.out.println(studentLastName);
		System.out.println(studentFirstInitial);
		System.out.println(studentLastInitial);
		System.out.println("Are the strings " + studentFirstName + " and " + studentFirstName2 + " are equal? :"
				+ studentFirstName.equals(studentFirstName2));
		System.out.println("Length of First Name :" + studentFirstName.length());
		System.out.println(studentFirstName + " " + studentLastName + " has a GPA of : " + studentGPA);
		System.out.println("What do you want to update it GPA ?");
		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();
		System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of : " + studentGPA);

	}

}
