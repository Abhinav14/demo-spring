package interview;

import java.util.Scanner;

public class PalindromeCheckWithLF {
	private static boolean isPalindrome(String str){
		if(str == null){
			return false;
		}
		StringBuilder strBldr = new StringBuilder(str);
		strBldr.reverse();
		return strBldr.toString().equals(str);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		System.out.println(isPalindrome(sc.nextLine()));
	}
}
