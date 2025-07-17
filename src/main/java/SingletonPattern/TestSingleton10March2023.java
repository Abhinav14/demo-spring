package SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton10March2023 {

	public static void main(String[] args) {
		
		//Singleton10March2023 instance1 = Singleton10March2023.getInstance();
		//Singleton10March2023 instance2 = Singleton10March2023.getInstance();
		
		//System.out.println("Instance1: "+instance1.hashCode());
		//System.out.println("Instance2: "+instance2.hashCode());
		
		//below code is to break singleton via reflection
		/*
		 * Singleton10March2023 instance1 = Singleton10March2023.getInstance();
		 * Singleton10March2023 instance2 = null; Class<Singleton10March2023> classRef =
		 * Singleton10March2023.class; try { Constructor<Singleton10March2023> cons =
		 * classRef.getDeclaredConstructor(); cons.setAccessible(true); instance2 =
		 * cons.newInstance(); } catch (NoSuchMethodException | SecurityException |
		 * InstantiationException | IllegalAccessException | IllegalArgumentException |
		 * InvocationTargetException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * System.out.println("Instance1: "+instance1.hashCode());
		 * System.out.println("Instance2: "+instance2.hashCode());
		 */
		
		//below code is to break singleton with object creation via threads
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton10March2023 instance12 = Singleton10March2023.getInstance();
				System.out.println("Instance1: "+instance12.hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton10March2023 instance22 = Singleton10March2023.getInstance();
				System.out.println("Instance2: "+instance22.hashCode());
			}
		});
		
		t1.start();
		t2.start();
	}

}
