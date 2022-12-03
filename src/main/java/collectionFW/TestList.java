package collectionFW;

import java.util.Arrays;
import java.util.List;

public class TestList {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Abhinav", "Anant", "Anusha", "Varma");
		//System.out.println(words);
		words.stream().forEach(p -> System.out.println(p));
		System.out.println(words.get(1));
		System.out.println(words.indexOf("Anusha"));
	}

}
