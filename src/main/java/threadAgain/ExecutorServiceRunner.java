package threadAgain;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new ThreadOne());
		executorService.execute(new ThreadTwo());
		executorService.execute(new ThreadThree());
		
		executorService.shutdown();
	}

}
