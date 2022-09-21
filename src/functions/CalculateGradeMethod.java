package functions;

import java.util.Scanner;

public class CalculateGradeMethod {

	// Line number 8 to 32 is called method definition for method name calculateGrade() 
	public static void calculateGrade() {
		Scanner input = new Scanner(System.in);
		int marks[] = new int[6];
		double total = 0 ;
		double avg;
		for (int i=0 ; i <2 ; i++) {
			System.out.println("Enter marks for subject"+ (i + 1) );
			marks[i]= input.nextInt();
			total = total + marks[i];
			
		}
		
		
		avg = total/6;
		
		if ( avg >=85) {
			System.out.println("A");
		}else if (avg >= 60  ) {
			System.out.println("B");
		}else if (avg >= 40) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter marks for student1");
		
		//Calling method
		calculateGrade();
		
		System.out.println("Enter marks for student2");
		
		//Calling method
		calculateGrade();

	}

}
