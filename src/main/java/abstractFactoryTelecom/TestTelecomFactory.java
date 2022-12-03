package abstractFactoryTelecom;

public class TestTelecomFactory {
	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory("postpaid");
		factory.getPlan("postpaid-annual").getPlanDetails();;
	}
}
