package threadAgain;

public class ThreadFour implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadFour Started");
		for(int i = 301; i <= 399; i++) {
			System.out.print(i+", ");
		}
		System.out.println("ThreadFour Ended");
	}
	
	

}
