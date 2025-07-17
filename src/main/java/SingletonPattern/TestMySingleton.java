package SingletonPattern;

public class TestMySingleton {

	public static void main(String[] args) {
		
		MySingleton obj1 = MySingleton.getMySingletonInstance();
		MySingleton obj2 = MySingleton.getMySingletonInstance();
		
		System.out.println("Instance1: "+obj1.hashCode());
		System.out.println("Instance2: "+obj2.hashCode());
		
	}

}
