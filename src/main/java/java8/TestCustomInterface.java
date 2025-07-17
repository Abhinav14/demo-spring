package java8;

public class TestCustomInterface {

	public static void main(String[] args) {
		CustomInterface customInterface = (x, y) -> System.out.println("Sum is: "+(x+y));
		customInterface.numSum(10,  15);
	}
	
}
