package javabasics;

public class TryCatchFinallyReturnFlow {
	
	public static int m1(){
		try{
			//System.out.println(10/0);
			return 1;
		}catch(Exception e){
			//return 2;
		}finally{
			System.out.println("Inside finally");
			//return 3;
		}
		//return 0;
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(m1());
	}

}
