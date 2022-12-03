package thread;

public class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++){
			System.out.println("Thread is running and run number is : "+i);
		}
	}

}
