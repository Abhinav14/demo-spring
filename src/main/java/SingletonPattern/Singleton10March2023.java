package SingletonPattern;

import java.io.Serializable;

public class Singleton10March2023 implements Serializable{
	
	private static volatile Singleton10March2023 sSoleInstance;
	
	private Singleton10March2023() {
		//below is for reflection safe
		  if(sSoleInstance != null) { 
			  throw new RuntimeException("Use the getInstance() for instance creation."); }
	}
	
	//below is for thread safe
	public static Singleton10March2023 getInstance() {
		if(sSoleInstance == null) {
			synchronized(Singleton10March2023.class) {
				if(sSoleInstance == null) {
					sSoleInstance = new Singleton10March2023();
				}
			}
		}
		return sSoleInstance;
	}
	
	//below is for serialize safe
	private Object readResolve() {
	    return getInstance();
	}
	
}
