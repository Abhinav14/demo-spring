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
		System.out.print("\nThreadFour Kicked Off");
		ThreadFour threadFour = new ThreadFour();
		Thread t4 = new Thread(threadFour);
		t4.start();
		System.out.print("\nThreadFive Kicked Off");
		ThreadFive threadFive = new ThreadFive();
		Thread t5 = new Thread(threadFive);
		t5.start();
		System.out.print("\nThreadSix Kicked Off");
                ThreadSix threadSix = new ThreadSix();
                Thread t6 = new Thread(threadSix);
		t6.start();
		System.out.print("\nThreadSeven Kicked Off");
                ThreadSeven threadSeven = new ThreadSeven();
                Thread t7 = new Thread(threadSeven);
                t7.start();
		System.out.print("\nThreadNine Kicked Off");
                ThreadNine threadNine = new ThreadNine();
                Thread t9 = new Thread(threadNine);
                t9.start();
		System.out.print("\nThreadEight Kicked Off");
                ThreadSeven threadEight = new ThreadEight();
                Thread t8 = new Thread(threadEight);
               	t8.start();
	}

}
