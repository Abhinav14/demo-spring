package javabasics;

public class Demo {
	
	private final int finVal = 10;
	
	public void checkFinally(){
		try{
			int mid = 10;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Inside Finally Block!");
		}
	}
	
	@Override
	protected void finalize()throws Throwable{
		System.out.println("Finalize method is called!");
	}

	public static void main(String[] args) {
		 Demo demo = new Demo();
		 demo.checkFinally();
		 demo = null;
		 System.gc();
	}

}
