package common;

import java.util.Comparator;

public class EmpAgeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

	//@Override
	/*public int compare(Employee o1, Employee o2) {
		if(o1.getAge() > o2.getAge()) {
			return 1;
		}else {
			return -1;
		}
	}*/



}
