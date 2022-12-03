package thread;

public class TestThreadRunnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadRunnable());
		t1.start();
		
	}

}
