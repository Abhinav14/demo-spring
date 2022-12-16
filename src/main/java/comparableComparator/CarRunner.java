package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarRunner {
	
	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Hyundai", "Verna", 1500000));
		cars.add(new Car("Maruti", "Grand Vittara", 2000000));
		cars.add(new Car("Tata", "Nexon", 1000000));
		
		CarComparator cc = new CarComparator();
		
		Collections.sort(cars, cc);
		
		cars.stream().forEach(x->System.out.println(x));
	}

}
