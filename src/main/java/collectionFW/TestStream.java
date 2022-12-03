package collectionFW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestStream {
	public static void main(String[] args) {
		//Stream<Integer> stream = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6 ,7 ,8, 9, 10, 11, 12, 13, 14, 15, 16});
		//stream.forEach(p -> System.out.println(p));
		//stream.filter(n -> n%2==0).forEach(p -> System.out.println(p));
		//List arrList = Arrays.asList(new Integer[]{10, 9, 4, 5, 8, 2, 7, 8, 3, 6});
		//arrList.stream().sorted().forEach(p -> System.out.println(p));
		/*List<Integer> newList = Arrays.asList(10, 9, 4, 5, 8, 2, 7, 8, 3, 6);
		newList.stream().sorted().forEach(p -> System.out.println(p));*/
		/*List<String> arrList = Arrays.asList("Patna", "Bangalore", "Pune", "Hyderabad", "Darbhanga", "Dhanbad", "Lucknow");
		//arrList.stream().forEach(p -> System.out.println(p));
		arrList.stream().filter(s -> !s.startsWith("D")).forEach(x -> System.out.println(x));*/
		/*List<Integer> intList = Arrays.asList(2, 4, 4, 5, 6, 6, 7, 7, 8, 9);
		//intList.stream().distinct().forEach(p -> System.out.println(p));
		System.out.println(intList.stream().distinct().findFirst());*/
		//List<String> words = Arrays.asList("Apple", "Bat", "Cat");
		//List<String> wordsArrList = new ArrayList<>(words);
		//words.stream().filter(s -> !s.contentEquals("Apple")).forEach(p -> System.out.println(p));
		
		/*HashMap<String, Integer> items = new HashMap();
        items.put("coins", 5);
        items.put("pens", 2);
        items.put("chairs", 7);
        
        //items.entrySet().stream().forEach(e -> System.out.format("key: %s, value: %d%n", e.getKey(), e.getValue()));
        
        for(Map.Entry<String, Integer> pair : items.entrySet()){
        	System.out.println("Key: "+pair.getKey()+", "+"Value: "+pair.getValue());
        }*/
		
		List<Integer> newList = Arrays.asList(1, 2, 3, 4, 5, 6 ,7 ,8, 9, 10, 11, 12, 13, 14, 15, 16);
		//List<Integer> storeHere = newList.stream().filter(n -> n%2 == 0).map(x -> x*x).collect(Collectors.toList());
		List<Integer> storeHere = newList.stream().sorted((x,y) -> Integer.compare(y, x)).collect(Collectors.toList());
		System.out.println(storeHere);
		
		
		
	}

}
