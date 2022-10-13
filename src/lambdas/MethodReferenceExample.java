package lambdas;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

public class MethodReferenceExample {

	public static void main(String[] args) {

		IntFunction<String> intToString = num -> Integer.toString(num);

		System.out.println("expected value 3, actual value: " + intToString.apply(123).length());

		// static method reference using ::

		IntFunction<String> intToString2 = Integer::toString;

		System.out.println("expected value 4, actual value:  " +

		intToString2.apply(4567).length());
		
		BigInteger obj = new BigInteger("123");

		// lambdas made using a constructor

		Function<String, BigInteger> newBigInt = BigInteger::new;

		System.out.println("expected value: 123456789, actual value: " +

		newBigInt.apply("123456789"));
		
		//example of a lambda made from an instance method
		

        Consumer<String> print = System.out::println;

        print.accept("Coming to you directly from a lambda...");

	}

}
