package reflection;

import java.lang.reflect.Constructor;

public class TestSingletonThreadReflectionSafe {
	
public static void main(String[] args) {
		
		SingletonThreadAndReflectionSafe singleton = SingletonThreadAndReflectionSafe.getInstance();
		SingletonThreadAndReflectionSafe reflection = null;
		
		try{
			Constructor[] constructors = SingletonThreadAndReflectionSafe.class.getDeclaredConstructors();
			for(Constructor constructor : constructors){
				constructor.setAccessible(true);
				reflection = (SingletonThreadAndReflectionSafe) constructor.newInstance();
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
		System.out.println("singleton is : "+singleton.hashCode());
		System.out.println("reflection is : "+reflection.hashCode());
		
	}

}
