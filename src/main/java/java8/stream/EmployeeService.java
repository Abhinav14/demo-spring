package java8.stream;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeService {
	
	public static List<Employee> evaluateTaxUsers(String input){
		return input.equalsIgnoreCase("tax") ? EmployeeDAO.getEmployees().stream().filter(a->a.getSalary()>500000).collect(Collectors.toList()) : EmployeeDAO.getEmployees().stream().filter(a->a.getSalary()<=500000).collect(Collectors.toList());
	}
	
	public static List<Employee> sortBySalary(){
		return EmployeeDAO.getEmployees().stream().sorted((o1, o2)->Integer.compare(o1.getSalary(), o2.getSalary())).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
		System.out.println(evaluateTaxUsers("tax"));
		
		//One way to sort by salary
		/*Collections.sort(EmployeeDAO.getEmployees(), new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
					return Integer.compare(o1.getSalary(), o2.getSalary());
			}
		});*/
		
		//Other way to sort by salary
		/*Collections.sort(EmployeeDAO.getEmployees(), new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary()-o2.getSalary();
			}
		});*/
		
		
		System.out.println(sortBySalary());
		
		List<Employee> empList = EmployeeDAO.getEmployees();
		empList.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(n->System.out.println(n));
		
	}

}
