package common;

public class TestSwap {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 6;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a: "+a+" ,b: "+b);
	}

}
