package abstractFactoryTelecom;

public class Fixedline_Annual implements Plan{

	@Override
	public void getPlanDetails() {
		System.out.println("This is a fixed-line annual plan!");
	}

}
