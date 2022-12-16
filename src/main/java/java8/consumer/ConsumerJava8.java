package java8.consumer;

import java.util.function.Consumer;

public class ConsumerJava8 {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = (t)->System.out.println("Welcome "+t+"!");
		
		consumer.accept("Abhinav");
		
	}
	

}
