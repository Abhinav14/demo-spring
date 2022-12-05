package threadAgain;

public class ThreadTwo implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadTwo Started");
		for(int i = 101; i <= 199; i++) {
			System.out.print(i+" ");
		}
		System.out.println("ThreadTwo Ended");
	}

}
