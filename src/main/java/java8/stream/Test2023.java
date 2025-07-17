package java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
//Refer https://javatechonline.com/stream-api-in-java-8/
public class Test2023 {

	public static void main(String[] args) {
		
		//Stream<String> animals = Stream.of("lion", "cat", "monkey", "cow", "horse");
		//animals.filter(x->x.startsWith("c")).forEach(y->System.out.println(y));
		//Stream<String> animals = Stream.of("cat", "cat", "monkey", "cow", "cat");
		//animals.distinct().forEach(x->System.out.println(x));
		
		//Stream<Integer> s = Stream.iterate(0, n->n+1);
		//s.skip(9).limit(6).forEach(x->System.out.println(x));
		
		/*List<Programmer> listOfProgrammers = List.of(
				new Programmer("Programmer1", List.of("Java", "Python", "Angular")),
				new Programmer("Programmer2", List.of("Ruby", "Angular", "Java")),
				new Programmer("Programmer3", List.of("React", "Spring", "Angular"))
				);*/
		
		//listOfProgrammers.stream().map(x->x.getName()).collect(Collectors.toList()).forEach(y->System.out.println(y));
		//listOfProgrammers.stream().map(x->x.getName()).forEach(y->System.out.println(y));
		
		//both the lines below will print same
		//listOfProgrammers.stream().flatMap(x->x.getSkills().stream()).collect(Collectors.toSet()).forEach(y->System.out.println(y));
		//listOfProgrammers.stream().flatMap(m->m.getSkills().stream()).distinct().forEach(n->System.out.println(n));
		
		
		Stream<String> streamOfStrings = Stream.of("Sunday", "Monday", "Wednesday", "Friday");
		//by default, it will be ascending
		//streamOfStrings.sorted().forEach(x->System.out.println(x));
		//sort in descending
		//streamOfStrings.sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
		
		
		List<Integer> tempList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		tempList.stream().filter(x->x%2==0).peek(x->System.out.println(x)).map(x->x*x).peek(x->System.out.println(x)).forEach(x->System.out.println("final: "+x));
		
		
	}

}
