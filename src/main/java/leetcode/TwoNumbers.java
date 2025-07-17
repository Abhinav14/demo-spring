package leetcode;

import java.util.*;

//Given an array of integers and a target number, find pair of elements which sum to target.
public class TwoNumbers {

	private static List<int[]> getPairs(int[] arr, int target){
		List<int[]> pairs = new ArrayList<>();
		Set<Integer> hset = new HashSet<>();
		int diff = 0;
		for(Integer i : arr){
			diff = target - i;
			if(hset.contains(diff)){
				int[] pairArr = new int[2];
				pairArr[0] = diff;
				pairArr[1] = i;
				pairs.add(pairArr);
			}else {
				hset.add(i);
			}
		}
		return pairs;
	}

	public static void main(String[] args) {
		List<int[]> result = getPairs(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);
		if(!result.isEmpty()){
			result.stream().forEach(x-> System.out.println(x[0]+", "+x[1]));
		}
	}

}
