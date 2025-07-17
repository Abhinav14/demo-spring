package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Rohan", 40, 165));
		employees.add(new Employee("Sohan", 30, 185));
		employees.add(new Employee("Mohan", 35, 155));
		
		
		
		Comparator<Employee> heightComp = new EmpHeightComparator();
		
		Collections.sort(employees, heightComp);
		
		employees.stream().forEach(System.out::println);
		
	}
	
}
