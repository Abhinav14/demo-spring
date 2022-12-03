package FactoryPattern;

import java.util.Scanner;

public class GenerateBill3 {
	public static void main(String[] args) {
		GetPlanFactory3 planFactory3 = new GetPlanFactory3();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the plan you are into: ");
		String str = sc.nextLine();
		Plan3 planType = planFactory3.getPlan(str);
		System.out.println("Please enter the units consumed: ");
		int units = sc.nextInt();
		planType.getRate();
		System.out.println("The selected plan is "+str+" and the unit consumed is "+units);
		planType.calculate(units);
	}
}
