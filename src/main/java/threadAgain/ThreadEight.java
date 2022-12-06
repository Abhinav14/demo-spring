package threadAgain;

public class ThreadEight implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadEight Started");
		for(int i = 701; i <= 799; i++) {
			System.out.print(i+", ");
		}
		System.out.println("ThreadEight Ended");
	}
	
	

}
