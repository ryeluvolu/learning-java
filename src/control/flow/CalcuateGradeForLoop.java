package control.flow;

import java.util.Scanner;

public class CalcuateGradeForLoop {

	public static void main(String[] args) {
		
		int marks[] = new int[6];
		double total = 0 ;
		double avg;
		Scanner input = new Scanner(System.in);
		for (int i=0 ; i <6 ; i++) {
			System.out.println("Enter marks for subject"+ (i + 1) );
			marks[i]= input.nextInt();
			total = total + marks[i];
			
		}
		input.close();
		avg = total/6;
		
		if ( avg >=80) {
			System.out.println("A");
		}else if (avg >= 60  ) {
			System.out.println("B");
		}else if (avg >= 40) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		System.out.println(total);

	}

}
