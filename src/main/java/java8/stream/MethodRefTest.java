package java8.stream;

public class MethodRefTest {
	
	public static void main(String[] args) {
		
		MethodRefInt ref = MethodRefClass::showName;
		ref.display();
	}

}
