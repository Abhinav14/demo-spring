package java8.consumer;

import java.util.function.Consumer;

public class ConsumerImplTraditional implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println("Welcome "+t+"!");
	}

}
