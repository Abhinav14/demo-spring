package java8.stream;

import java.util.Arrays;
import java.util.List;

public class MethodRefStream {
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		intList.stream().forEach(System.out::println);
		
	}

}
