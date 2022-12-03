package reflection;

public class SingletonThreadAndReflectionSafe {
	
	private static volatile SingletonThreadAndReflectionSafe instance = new SingletonThreadAndReflectionSafe();
	
	private SingletonThreadAndReflectionSafe(){
		if(instance != null){
			throw new IllegalStateException("Instance already exists...");
		}
	}
	
	public static SingletonThreadAndReflectionSafe getInstance(){
		if(instance == null){
			synchronized (SingletonThreadAndReflectionSafe.class) {
				if(instance == null){
					instance = new SingletonThreadAndReflectionSafe();
				}
			}
		}
		return instance;
		
	}

}
