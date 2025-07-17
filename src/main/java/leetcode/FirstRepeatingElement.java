package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		System.out.println(extracted("apple"));

	}

	private static String extracted(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])){
				map.put(charArray[i], map.get(charArray[i])+1);
			}else{
				map.put(charArray[i], 1);
			}
		}

		for(Map.Entry<Character, Integer> pair: map.entrySet()){
			if(pair.getValue()>1){
				return "The first repetitive character is: "+pair.getKey();
			}
		}
		return "There is no repetitive character in the given string.";
	}

}
