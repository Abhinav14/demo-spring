package java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.security.auth.x500.X500Principal;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> tempList = new ArrayList<String>();
		tempList.add("Abhinav");
		tempList.add("Anant");
		tempList.add("Anusha");
		tempList.add("Varma");
		
		/*for(String name : tempList) {
			System.out.println(name);
		}*/
		//Iterating and printing tempList
		//tempList.stream().forEach(x->System.out.println(x));
		
		//Printing names which starts with letter "A"
		//tempList.stream().filter(y->y.startsWith("A")).forEach(z->System.out.println(z));
		
		Map<String, Integer> hMap = new HashMap<>();
		hMap.put("Abhinav", 2);
		hMap.put("Anant", 1);
		hMap.put("Anusha", 2);
		hMap.put("Varma", 1);
		
		//Iterating map with stream api
		//hMap.entrySet().stream().filter(a->a.getValue()>1).forEach(b->System.out.println("Key: "+b.getKey()+", Value: "+b.getValue()));
		
		//Traditional Iterator way
		/*Iterator itr = hMap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> pair = (Entry<String, Integer>) itr.next();
			if(pair.getValue()>1) {
				System.out.println("Key: "+pair.getKey()+", Value: "+pair.getValue());
			}
		}*/
		
		for(int i = 0; i < hMap.size(); i++) {
			
		}
		
	}

}
