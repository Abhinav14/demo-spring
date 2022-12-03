package SingletonPattern;

public class SingletonClass2 {
	private static SingletonClass2 singleton;
	
	private SingletonClass2(){}
	
	public static SingletonClass2 getInstance(){
		if(singleton == null){
			singleton = new SingletonClass2();
		}
		return singleton;
	}
}
