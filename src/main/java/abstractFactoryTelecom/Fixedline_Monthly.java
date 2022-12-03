package abstractFactoryTelecom;

public class Fixedline_Monthly implements Plan{

	@Override
	public void getPlanDetails() {
		System.out.println("This is a fixed-line monthly plan!");
	}

}
