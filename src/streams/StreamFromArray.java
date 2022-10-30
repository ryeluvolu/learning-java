package streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * This example demonstrates, obtaining a stream from an Array of Strings
 * This program does not produce any output because we have not used the stream.
 * @author ryelu
 *
 */
public class StreamFromArray {

	public static void main(String[] args) {
	String[] stringArray = {"Rama","Krishna","Yeluvolu"};
	Stream<String> nameStream = Arrays.stream(stringArray);
	

	}

}
