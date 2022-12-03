package javabasics;

public class TestString {
	public static void main(String[] args) {
		String s1 = new String("Abhinav");
		String s2 = new String("Anant");
		String s3 = new String("Anant");
		String s4 = s1;
		System.out.println("Hashcode of s1 is : "+s1.hashCode());
		System.out.println("Hashcode of s2 is : "+s2.hashCode());
		System.out.println("Hashcode of s3 is : "+s3.hashCode());
		System.out.println("Hashcode of s4 is : "+s4.hashCode());
	}

}
