package FactoryPattern;

public abstract class Plan4 {
	int rate;
	public abstract void getRate();
	
	public void calculate(int units){
		System.out.println(units*rate);
	}
}
