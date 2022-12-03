package builderPattern;

public class TestBugerBuilder {
	public static void main(String[] args) {
		Burger vegBurger = new BurgerBuilder()
				.addBread("Brown Bread")
				.addPatty("Veggie")
				.addSauces("All").addCheeze().build();
		
				
	}
}
