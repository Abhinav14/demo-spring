package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	public static List<Employee> getEmployees(){
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Abhinav", "IT", 1000000));
		empList.add(new Employee(102, "Anant", "IT", 1600000));
		empList.add(new Employee(103, "Anusha", "HR", 800000));
		empList.add(new Employee(104, "Xyz", "Finance", 400000));
		return empList;
	}

}
