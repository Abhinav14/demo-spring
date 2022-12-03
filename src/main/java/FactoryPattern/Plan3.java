package FactoryPattern;

public abstract class Plan3 {
	protected double rate;
	abstract void getRate();
	
	public void calculate(int units){
		System.out.println(units*rate);
	}
}
