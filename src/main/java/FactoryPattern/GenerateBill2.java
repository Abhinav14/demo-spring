package FactoryPattern;

import java.util.Scanner;

public class GenerateBill2 {
	public static void main(String[] args) {
		GetPlanFactory2 planFactory2 = new GetPlanFactory2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the plan for which you want the bill to be calculated: ");
		String str = sc.nextLine();
		System.out.println("Please enter number of units, you have consumed: ");
		int units = sc.nextInt();
		
		Plan2 planName = planFactory2.getPlan(str);
		planName.gateRate();
		System.out.println("Plan name is "+str+" the unit consumed are "+units+" and total bill is: ");
		planName.calculate(units);
	}
}
