package abstractFactoryTelecom;

public class Postpaid_Annual implements Plan{

	@Override
	public void getPlanDetails() {
		System.out.println("This is a post-paid annual plan!");
	}

}
