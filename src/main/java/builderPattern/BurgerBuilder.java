package builderPattern;

public class BurgerBuilder {
	private Burger burger;

	public BurgerBuilder() {
		this.burger = new Burger();
	}
	
	public BurgerBuilder addBread(String bread){
		burger.setBread(bread);
		return this;
	}
	
	public BurgerBuilder addPatty(String patty){
		burger.setBread(patty);
		return this;
	}
	
	public BurgerBuilder addVeggies(String veggies){
		burger.setBread(veggies);
		return this;
	}
	
	public BurgerBuilder addSauces(String sauces){
		burger.setBread(sauces);
		return this;
	}
	
	public BurgerBuilder addCheeze(){
		burger.setWithExtraCheeze(Boolean.TRUE);
		return this;
	}
	
	public Burger build(){
		return this.burger;
	}
}
