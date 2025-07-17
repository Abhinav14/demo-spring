package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicatesAgain {
	public static void main(String[] args) {
		
		String[] names = {"Abhinav", "Anusha", "Abhinav", "Anant"};
		
		Map<String, Integer> hmap = new HashMap<>();
		
		/*
		 * for(String name : names) { if(hmap.containsKey(name)) { hmap.put(name,
		 * hmap.get(hmap)+1); }else { hmap.put(name, 1); } }
		 */
		
		for(int i = 0; i < names.length; i++) {
			if(hmap.containsKey(names[i])) {
				hmap.put(names[i], hmap.get(names[i])+1);
			}else {
				hmap.put(names[i], 1);
			}
		}
		
		//hmap.entrySet().stream().forEach(x->System.out.println("key:"+x.getKey()+", value:"+x.getValue()));
		
		//hmap.entrySet().stream().filter(x->x.getValue()>1).forEach(y->System.out.println("key:"+y.getKey()+", value:"+y.getValue()));
		
		Iterator itr = hmap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> pair = (Entry<String, Integer>) itr.next();
			if(pair.getValue()>1) {
				System.out.println("Key:"+pair.getKey()+", value:"+pair.getValue());
			}
		}
	}
}
