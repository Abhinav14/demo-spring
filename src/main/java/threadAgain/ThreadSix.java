package threadAgain;

public class ThreadFour implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadSix Started");
		for(int i = 501; i <= 599; i++) {
			System.out.print(i+", ");
		}
		System.out.println("ThreadSix Ended");
	}
	
	

}

