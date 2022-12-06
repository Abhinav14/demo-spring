package threadAgain;

public class ThreadFive implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadFive Started");
		for(int i = 401; i <= 499; i++) {
			System.out.print(i+", ");
		}
		System.out.println("ThreadFive Ended");
	}
	
	

}
