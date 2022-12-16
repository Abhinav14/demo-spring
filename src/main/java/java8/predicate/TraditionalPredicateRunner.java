package java8.predicate;

import java.util.function.Predicate;

public class TraditionalPredicateRunner {
	public static void main(String[] args) {
		Predicate<Integer> predicate = new PredicateImplTraditional();
		System.out.println(predicate.test(10));
	}
}
