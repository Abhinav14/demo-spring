package concurrency;

public class BiCounter {
	
	private int i = 0;
	private int j = 0;
	
	synchronized public void incrementI() {
		i++;
		//get i
		//increment i
		//set i
	}
	
	public int getI() {
		return i;
	}
	
	synchronized public void incrementJ() {
		j++;
		//get j
		//increment j
		//set j
	}
	
	public int getJ() {
		return j;
	}

	//Here since all the methods are synchronized, if any thread enters the class, it will acquire lock on both the synchronized methods. 
	//Lets say thread-1 enters, then it will acquire lock on both incrementI() and incrementJ(). And during that time thread-2 will have to wait.
	//It impacts performance of the application. To avoid that, will implement Lock in BiCounterWithLock.java
	
}
