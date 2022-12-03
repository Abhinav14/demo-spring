package reflection;

import java.lang.reflect.Constructor;

public class TestReflectionProofSingleton {

	public static void main(String[] args) {
		
		ReflectionProofSingleton singleton = ReflectionProofSingleton.getInstance();
		ReflectionProofSingleton reflection = null;
		
		try{
			Constructor[] constructors = ReflectionProofSingleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors){
				constructor.setAccessible(true);
				reflection = (ReflectionProofSingleton) constructor.newInstance();
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
		System.out.println("singleton is : "+singleton.hashCode());
		System.out.println("reflection is : "+reflection.hashCode());
		
	}
	
}
