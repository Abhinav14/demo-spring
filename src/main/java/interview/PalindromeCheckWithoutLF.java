package interview;

import java.util.Scanner;

public class PalindromeCheckWithoutLF {
	
	private static boolean isPalindrome(String str){
		if(str == null){
			return false;
		}
		int length = str.length();
		System.out.println("Half of the length is "+length/2);
		for(int i = 0; i < length/2; i ++){
			if(str.charAt(i) != str.charAt((length-1)-i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		System.out.println(isPalindrome(sc.nextLine()));
	}
	
}
