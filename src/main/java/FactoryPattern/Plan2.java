package FactoryPattern;

public abstract class Plan2 {
	protected double rate;
	public abstract void gateRate();
	
	public void calculate(int units){
		System.out.println(units*rate);
	}
	

}
