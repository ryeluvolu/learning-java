package control.flow;

public class ContinueStatement {

	public static void main(String[] args) {
		
		int i = 0;
		for(i=0; i <=10; i++) {	
			if (i == 8) {
				continue;
			}
			System.out.println(i);		
		}
		System.out.println("Value of i end of for loop: "+i);

	}

}
