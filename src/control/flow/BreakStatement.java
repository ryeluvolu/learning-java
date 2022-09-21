package control.flow;

public class BreakStatement {

	public static void main(String[] args) {
		
		int i = 0;
		for(i=0; i <=10; i++) {	
			if (i == 8) {
				break;
			}
			System.out.println(i);		
		}
		System.out.println("Value of i end of for loop: "+i);

	}

}
