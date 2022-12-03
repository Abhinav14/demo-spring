package interview;

import java.util.StringJoiner;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		s2 = s2.intern();
		System.out.println(s2.intern());
		System.out.println(s1.intern());
	}

}
