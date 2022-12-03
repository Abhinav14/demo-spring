package interview;

import java.util.Scanner;

public class PalindromeCheck {
	
	private static boolean isPalindrome(String str){
		if(str == null){
			return false;
		}
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.reverse();
		return stringBuilder.toString().equals(str);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		boolean flag = isPalindrome(sc.nextLine());
		System.out.println(flag);
	}

}
