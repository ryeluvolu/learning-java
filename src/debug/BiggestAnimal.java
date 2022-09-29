package debug;

import java.util.Scanner;

public class BiggestAnimal {

	public static void main(String[] args) {
		String choice1 = "Tiger";
		String choice2 = "Elephent";
		String choice3 = "Bear";
		String correctAnswer = choice2;
		System.out.println("What is the biggest animal on land ? ");
		System.out.println("Choose one of the following " + choice1 + " , " + choice2 + " or " + choice3);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if(correctAnswer.equalsIgnoreCase(input)) {
			System.out.println("Congrats! Thats the correct Answer");
		}else {
			System.out.println("Its incorrect answer!");
		}
		scanner.close();
		
	}

}
