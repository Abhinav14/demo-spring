package reflection;

import java.lang.reflect.Constructor;

public class TestSingletonWithReflection {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		Singleton reflection = null;
		
		try{
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors){
				constructor.setAccessible(true);
				reflection = (Singleton)constructor.newInstance();
			}
		}catch(Exception e){
			throw new RuntimeException();
		}
		System.out.println("singleton : "+singleton.hashCode());
		System.out.println("reflection : "+reflection.hashCode());
	}

}
