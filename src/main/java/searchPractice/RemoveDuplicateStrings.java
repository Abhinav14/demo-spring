package searchPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateStrings {
	
	public static void main(String[] args) {
		
		String[] names = {"Abhinav", "Anusha", "Anant", "Varma", "Abhinav", "Varma"};
		
		Map<String, Integer> hmap = new HashMap<>();
		for(int i = 0; i < names.length; i++){
			if(hmap.containsKey(names[i])){
				hmap.put(names[i], hmap.get(names[i])+1);
			}else{
				hmap.put(names[i], 1);
			}
		}
		
		Iterator itr =  hmap.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry pair = (Map.Entry) itr.next();
			if((int)pair.getValue() > 1){
				System.out.println("Key "+pair.getKey()+" has "+pair.getValue()+" entries");
			}
		}
	}
	
}
