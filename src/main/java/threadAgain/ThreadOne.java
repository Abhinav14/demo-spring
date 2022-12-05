package threadAgain;

public class ThreadOne extends Thread{
	
	@Override
	public void run() {
		System.out.println("ThreadOne Started");
		for(int i = 1; i <= 99; i++) {
			System.out.print(i+", ");
		}
		System.out.println("ThreadOne Ended");
	}

}
