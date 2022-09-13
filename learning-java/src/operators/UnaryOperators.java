package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		int e =10;
		int f = 10;
		boolean flag = false ;
		
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(c--);
		System.out.println(--c);
		System.out.println(--d);
		System.out.println(d--);
		System.out.println(d);
		
		System.out.println(e++ + ++e);// 10 + 12
		System.out.println(f-- - --f);// 10 - 8 
		System.out.println(!flag);

	}

}
