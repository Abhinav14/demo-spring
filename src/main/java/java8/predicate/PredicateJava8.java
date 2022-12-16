package java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJava8 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (t) -> t%2 == 0 ? true:false;
		
		System.out.println(predicate.test(9));
		
		//Testing | Checking stream api
		List<Integer> tempList = Arrays.asList(1, 2, 3, 4, 5);
		tempList.stream().filter(predicate).forEach(y->System.out.println(y));
	}

}
