package javabasics;

import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeFirstRepeat {

	public static void main(String[] args) {
		
		String str = "apple";
		
		/*
		 * for(int i = 0; i < str.length(); i++) {
		 * if(str.indexOf(i)==str.lastIndexOf(i)) {
		 * System.out.println("The first non repeating character is: "+str.charAt(i));
		 * break; } }
		 */
		
		Map<Character, Integer> lhmap = new LinkedHashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(lhmap.containsKey(str.charAt(i))) {
				lhmap.put(str.charAt(i), lhmap.get(str.charAt(i))+1);
			}else {
				lhmap.put(str.charAt(i), 1);
			}
		}
		
		char ch = lhmap.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
		System.out.println("The first non repeating character is: "+ch);
		
	}

}
