package javabasics;

public interface Payment {
	
	public void doTransaction();
	
	default void addCoupon(){
		System.out.println("add Rs. 5 cashback");
	}
	
	static void generateTransactionReport(){
		System.out.println("generate each transaction report");
	}

}
