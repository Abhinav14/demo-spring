package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestRefClassPractice {
	
	public static void main(String[] args) {
		RefClassPractice obj = null;
		try{
			Constructor[] constructors = RefClassPractice.class.getDeclaredConstructors();
			for(Constructor constructor : constructors){
				constructor.setAccessible(true);
				obj = (RefClassPractice)constructor.newInstance();
				Method privateMethod = RefClassPractice.class.getDeclaredMethod("displayMessage");
				privateMethod.setAccessible(true);
				privateMethod.invoke(obj);
			}
		}catch(Exception e){
			throw new RuntimeException();
		}
	}
}
