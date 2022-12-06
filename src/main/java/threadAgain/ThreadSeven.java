package threadAgain;

public class ThreadSeven implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadSeven Started");
		for(int i = 601; i <= 699; i++) {
			System.out.print(i+", ");
		}
		System.out.println("ThreadSeven Ended");
	}
	
	

}
