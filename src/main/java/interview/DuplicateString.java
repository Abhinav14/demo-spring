package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateString {
	private static Map<String, Integer> duplicateCheck(String[] strArr){
		Map<String, Integer> hmap = new HashMap<>();
		for(int i = 0; i < strArr.length; i++){
			if(hmap.containsKey(strArr[i])){
				hmap.put(strArr[i], hmap.get(strArr[i])+1);
			}else{
				hmap.put(strArr[i], 1);
			}
		}
		return hmap;
	}
	
	public static void main(String[] args) {
		Map<String, Integer> hm = duplicateCheck(new String[]{"Abhinav", "Anant", "Anusha", "Varma", "Abhinav", "Anusha"});
		Iterator itr = hm.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, Integer> pair = (Entry<String, Integer>) itr.next();
			if(pair.getValue() > 1){
				System.out.println("String literal "+pair.getKey()+" has total "+pair.getValue()+" occurences.");
			}
		}
	}
}
