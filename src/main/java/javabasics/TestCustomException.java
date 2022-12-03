package javabasics;

public class TestCustomException {
	
	public void getOrder(int orderId) throws OrderNotFoundException{
		if(orderId == 101){
			throw new OrderNotFoundException("Order not found with id "+orderId);
		}else{
			System.out.println("No exception found!");
		}
	}
	
	public static void main(String[] args) {
		TestCustomException test = new TestCustomException();
		try {
			test.getOrder(101);
		} catch (OrderNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
