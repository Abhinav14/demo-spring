package SingletonPattern;

public class SingletonClass {
	private static SingletonClass singleton;
	
	private SingletonClass(){}
	
	public static SingletonClass getInstance(){
		if(singleton == null){
			singleton =  new SingletonClass();
		}
		return singleton;
	}
}
