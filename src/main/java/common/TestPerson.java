package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPerson {
	
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Robert", 30, 178));
		persons.add(new Person("Tom", 40, 165));
		persons.add(new Person("John", 25, 170));
		
		Collections.sort(persons);
		
		persons.stream().forEachOrdered(System.out::println);
		
	}

}
