package practice;

public class TestSingletonClass {

	public static void main(String[] args) {
		
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
