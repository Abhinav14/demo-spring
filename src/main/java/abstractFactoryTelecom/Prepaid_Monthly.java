package abstractFactoryTelecom;

public class Prepaid_Monthly implements Plan{

	@Override
	public void getPlanDetails() {
		System.out.println("This is a pre-paid monthly plan!");
	}

}
