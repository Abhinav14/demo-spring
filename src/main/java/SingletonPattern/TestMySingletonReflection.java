package SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestMySingletonReflection {

	public static void main(String[] args) {
		
		//create one instance of your singleton using getInstance()
		//declare another instance of your singleton and assign null
		//get your singleton class ref
		//from that class ref, get constructor
		//set setAccessible of constructor to true
		//assign instantiate second instance of singleton class
		
		MySingletonReflectionProof instance1 = MySingletonReflectionProof.getInstance();
		MySingletonReflectionProof instance3 = MySingletonReflectionProof.getInstance();
		MySingletonReflectionProof instance2 = null;
		
		Class<MySingletonReflectionProof> classRef = MySingletonReflectionProof.class;
		try {
			Constructor<MySingletonReflectionProof> cons = classRef.getDeclaredConstructor();
			cons.setAccessible(true);
			instance2 = cons.newInstance();
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		System.out.println("Instance1: "+instance1.hashCode());
		System.out.println("Instance3: "+instance3.hashCode());
		System.out.println("Instance2: "+instance2.hashCode());
	}

}
