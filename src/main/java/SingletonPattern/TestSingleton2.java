package SingletonPattern;

public class TestSingleton2 {

	public static void main(String[] args) {
		
		SingletonClass2 obj1 = SingletonClass2.getInstance();
		SingletonClass2 obj2 = SingletonClass2.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
