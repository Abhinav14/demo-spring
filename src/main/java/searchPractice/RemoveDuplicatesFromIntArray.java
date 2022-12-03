package searchPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveDuplicatesFromIntArray {
	public static void main(String[] args) {
		int[] arr = {5, 8, 9, 8, 5, 7, 2, 7, 6, 3, 4, 5};
		
		Map<Integer, Integer> hmap = new HashMap<>();
		for(int i =0; i < arr.length; i++){
			if(hmap.containsKey(arr[i])){
				hmap.put(arr[i], hmap.get(arr[i])+1);
			}else{
				hmap.put(arr[i], 1);
			}
		}
		
		Iterator itr = hmap.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry pair = (Map.Entry)itr.next();
			if((int)pair.getValue() > 1){
				System.out.println(pair.getKey()+" has total "+pair.getValue()+" entries.");
			}
		}
	}
}
