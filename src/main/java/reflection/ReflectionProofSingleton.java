package reflection;

public class ReflectionProofSingleton {
	private static ReflectionProofSingleton singleton = new ReflectionProofSingleton();
	
	private ReflectionProofSingleton(){
		if(singleton != null){
			throw new IllegalStateException("Singleton already initialized");
		}
	}
	
	public static synchronized ReflectionProofSingleton getInstance(){
		return singleton;
	}
}
