package SingletonPattern;

public class MySingletonSynchronized {
	
	private volatile static MySingletonSynchronized sSoleInstance;
	
	private MySingletonSynchronized() {
		if(sSoleInstance != null) {
			throw new RuntimeException("Use getInstance()");
		}
	}
	
	public static MySingletonSynchronized getInstance() {
		System.out.println(Thread.currentThread().getName());
		
		if(sSoleInstance == null) {
			synchronized(MySingletonSynchronized.class){
				if(sSoleInstance == null) {
					sSoleInstance = new MySingletonSynchronized();
				}
			}
		}
		
		return sSoleInstance;
	}

}
