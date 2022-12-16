package java8.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerJava8Int {
	public static void main(String[] args) {
		Consumer<Integer> consumer = (t)->System.out.println("Printing: "+t);
		consumer.accept(10);
		
		List<Integer> tempList = Arrays.asList(1, 2, 3, 4, 5);
		tempList.stream().forEach(consumer);
	}
}
