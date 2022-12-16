package java8.predicate;

import java.util.function.Predicate;

public class PredicateImplTraditional implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t%2 == 0 ? true:false;
	}

}
