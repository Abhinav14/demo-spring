package javabasics;

import java.util.LinkedHashMap;

public class TestFirstRepeat {

	public static void main(String[] args) {
		
		String str = "apple";
		char[] charArr = str.toCharArray();
		
		LinkedHashMap<Character, Integer> lhmap = new LinkedHashMap<>();
		
		for(int i = 0; i < charArr.length; i++) {
			if(lhmap.containsKey(charArr[i])) {
				lhmap.put(charArr[i], lhmap.get(charArr[i])+1);
			}else {
				lhmap.put(charArr[i], 1);
			}
		}
		char firstChar;
		
		lhmap.entrySet().stream().filter(x->x.getValue()==1).forEach(y->System.out.println(y));
		
	}

}
