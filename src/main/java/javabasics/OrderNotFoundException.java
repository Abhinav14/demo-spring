package javabasics;

public class OrderNotFoundException extends Exception{
	public OrderNotFoundException(String message){
		super(message);
	}
}