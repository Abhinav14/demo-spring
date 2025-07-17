package SingletonPattern;

public class MySingleton {
	
	private static MySingleton singleInstance;
	
	private MySingleton() {}
	
	public static MySingleton getMySingletonInstance() {
		if(singleInstance == null) {
			singleInstance = new MySingleton();
		}
		return singleInstance;
	}

}
