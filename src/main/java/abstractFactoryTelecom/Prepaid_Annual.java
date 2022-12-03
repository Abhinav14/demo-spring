package abstractFactoryTelecom;

public class Prepaid_Annual implements Plan{

	@Override
	public void getPlanDetails() {
		System.out.println("This is a pre-paid annual plan!");
	}

}
