package threadAgain;

public class ThreadNine implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadNiner Started");
		for(int i = 801; i <= 899; i++) {
			System.out.print(i+", ");
		}
		System.out.println("ThreadNine Ended");
	}
	
	

}
