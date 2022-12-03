package abstractFactoryTelecom;

public class Postpaid_Monthly implements Plan{

	@Override
	public void getPlanDetails() {
		System.out.println("This is a post-paid monthly plan!");
	}

}
