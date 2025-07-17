package common;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "aapplle";
		
		/*
		 * for(char c : str.toCharArray()) { if(str.indexOf(c)==str.lastIndexOf(c)) {
		 * System.out.println("The first non-repeating character is:"+c); break; } }
		 */
		
		System.out.println("Final result: "+firstNonRepeatingCharacter(str));
		
	}

	private static Character firstNonRepeatingCharacter(String str) {
		HashMap<Character, Integer> lhmap = new LinkedHashMap<>();
		
		for(char i : str.toCharArray()) {
			if(lhmap.containsKey(i)) {
				lhmap.put(i, lhmap.get(i)+1);
			}else {
				lhmap.put(i, 1);
			}
		}
		
		/*
		 * for(Map.Entry<Character, Integer> entry : lhmap.entrySet()) {
		 * if(entry.getValue()==1) {
		 * System.out.println("First non repeating character is : "+entry.getKey());
		 * return entry.getKey(); } }
		 */
		
		return lhmap.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
		//return null;
	}

}
