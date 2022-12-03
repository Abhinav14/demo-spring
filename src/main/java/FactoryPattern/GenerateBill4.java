package FactoryPattern;

import java.util.Scanner;

public class GenerateBill4 {
	public static void main(String[] args) {
		GetPlanFactory4 planFactory = new GetPlanFactory4();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the plan you are into : ");
		String str = sc.nextLine();
		System.out.println("Please enter the units consumed : ");
		int units = sc.nextInt();
		Plan4 planName = planFactory.getPlan(str);
		planName.getRate();
		System.out.println("You fall in "+str+" and you have consumed "+units+ " units.");
		System.out.println("Your total bill is below: ");
		planName.calculate(units);
	}
}
