package threadAgain;

public class ThreadRunner {

	public static void main(String[] args) {
		System.out.print("\nThreadOne Kicked Off");
		ThreadOne t1 = new ThreadOne();
		t1.start();
		System.out.print("\nThreadTwo Kicked Off");
		ThreadTwo threadTwo = new ThreadTwo();
		Thread t2 = new Thread(threadTwo);
		t2.start();
		System.out.print("\nThreadThree Kicked Off");
		ThreadThree threadThree = new ThreadThree();
		Thread t3 = new Thread(threadThree);
		t3.start();
	}

}