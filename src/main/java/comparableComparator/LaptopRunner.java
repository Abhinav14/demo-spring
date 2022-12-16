package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopRunner {

	public static void main(String[] args) {
		
		List<Laptop> laptops = new ArrayList<>();
		laptops.add(new Laptop("Dell", 16, 800));
		laptops.add(new Laptop("Apple", 8, 1200));
		laptops.add(new Laptop("Acer", 12, 700));
		
		Collections.sort(laptops);
		
		laptops.stream().forEach(x->System.out.println(x));
	}

}
