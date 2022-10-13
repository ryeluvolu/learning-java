package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/*

* Sample program to introduce functional interfaces with lambda notation

*/
public class FuntionalInterfacesWithLamba {

	public static void main(String[] args) {
		
		//using the test method of Predicate

        Predicate<String> stringLen  = (t)->  t.length() < 20;
      
        
        System.out.println(stringLen.test("Ramakrishna") + " - Ramakrishna is less than 20");

 

        //Consumer example uses accept method

         Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());

         consumerStr.accept("ABCDefghijklmnopQRSTuvWxyZ");

        

        //Function example       

        Function<Integer,String> converter = (num)-> Integer.toString(num);

        System.out.println("length of 100: " + converter.apply(100).length());

 

        //Supplier example

        Supplier<String> s  = ()-> "Lambda expressions are great!";

        System.out.println(s.get());

       

        //Unary Operator example

        UnaryOperator<String> str  = (msg)-> msg.toUpperCase();

        System.out.println(str.apply("This is my message in upper case"));
        
        
        
      //Binary Operator example

        BinaryOperator<Integer> add = (a, b) -> a + b;

        System.out.println("add 30 + 15: " + add.apply(30, 15));


	}

}
