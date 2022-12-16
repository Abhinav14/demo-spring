package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarBrandCompRunner {
	
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Hyundai", "Verna", 1500000));
		cars.add(new Car("Maruti", "Grand Vittara", 2000000));
		cars.add(new Car("Tata", "Nexon", 1000000));
		cars.add(new Car("Audi", "Q7", 4000000));
		
		CarBrandComp comp = new CarBrandComp();
		Collections.sort(cars, comp);
		cars.stream().forEach(x->System.out.println(x));
		
		
		CarComparator carComparator = new CarComparator();
		Collections.sort(cars, carComparator);
		cars.stream().forEach(y->System.out.println(y));
		
		
		
	}

}
