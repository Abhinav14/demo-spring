package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String[] names = {"Bangalore", "Delhi", "Gurgaon", "Noida", "Patna", "Delhi", "Patna"};
		Map<String, Integer> hMap = new HashMap<>();
		for(int i = 0; i < names.length; i++){
			if(hMap.containsKey(names[i])){
				hMap.put(names[i], hMap.get(names[i])+1);
			}else{
				hMap.put(names[i], 1);
			}
		}
		
		Iterator itr = hMap.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, Integer> pair = (Entry<String, Integer>) itr.next();
			if(pair.getValue() > 1){
				System.out.println("City "+pair.getKey()+" has "+pair.getValue()+" occurences.");
			}
		}
	}
}
