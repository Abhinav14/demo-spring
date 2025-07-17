package SingletonPattern;

public class TestMySingletonThreadSafe {
		
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingletonSynchronized instance1 = MySingletonSynchronized.getInstance();
				System.out.println("Instance1:"+instance1.hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingletonSynchronized instance2 = MySingletonSynchronized.getInstance();
				System.out.println("Instance2:"+instance2.hashCode());
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
