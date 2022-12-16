package java8;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	void m1();
	
	//Comment m5 coz funtional interface can have only one abstract method.
	//void m5();
	
	default void m2() {
		System.out.println("Default method-2");
	}
	
	default void m3() {
		System.out.println("Default method-3");
	}
	
	default void m4() {
		System.out.println("Default method-4");
	}
}
