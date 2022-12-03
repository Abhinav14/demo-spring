package reflection;

import java.lang.reflect.Constructor;

public class TestSingletonClass {

	public static void main(String[] args) {
		
		SingletonClass singleton = SingletonClass.getInstance();
		SingletonClass reflection = null;
		
		try{
			Constructor[] constructors = SingletonClass.class.getDeclaredConstructors();
			for(Constructor constructor : constructors){
				constructor.setAccessible(true);
				reflection = (SingletonClass)constructor.newInstance();
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
		//System.out.println("singleton is : "+singleton.hashCode());
		System.out.println("reflection is : "+reflection.hashCode());
		
		
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
