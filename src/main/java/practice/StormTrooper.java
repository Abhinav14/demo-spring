package practice;

public class StormTrooper {
	
	String color = "White";
	String master = "Master";
	
	StormTrooper(){
		System.out.println("Welcome to the Storm Trooper!");
	}
	
	public static void main(String[] args) {
		StormTrooper stormTrooper1 = new StormTrooper();
		StormTrooper stormTrooper2 = stormTrooper1;
		
		System.out.println("StormTrooper1 : "+stormTrooper1.master);
		System.out.println("StormTrooper2 : "+stormTrooper2.master);
		
		stormTrooper2.master = "Grand Master";
		
		System.out.println("StormTrooper1 : "+stormTrooper1.master);
		System.out.println("StormTrooper2 : "+stormTrooper2.master);
	}
}
