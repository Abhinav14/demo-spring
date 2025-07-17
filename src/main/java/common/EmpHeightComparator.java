package common;

import java.util.Comparator;

public class EmpHeightComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getHeight() > o2.getHeight()) {
			return 1;
		}else {
			return -1;
		}
	}

}
