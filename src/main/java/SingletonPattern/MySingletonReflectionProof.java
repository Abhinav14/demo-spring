package SingletonPattern;

public class MySingletonReflectionProof {
	//private static instance variable
	//private constructor
	//if singleton instance is not null and an attempt is made to create instance, throw runtime exception from private constructor
	//public getInstance()
	
	private static MySingletonReflectionProof singleInstance;
	
	private MySingletonReflectionProof() {
		if(singleInstance!=null) {
			throw new RuntimeException("use getInstance() to create instance");
		}
	}
	
	public static MySingletonReflectionProof getInstance() {
		if(singleInstance == null) {
			singleInstance = new MySingletonReflectionProof();
		}
		return singleInstance;
	}
	
	
}
