package abstractFactoryTelecom;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory){
		if(factory.equalsIgnoreCase("prepaid")){
			return new PrepaidFactory();
		}else if(factory.equalsIgnoreCase("postpaid")){
			return new PostpaidFactory();
		}else if(factory.equalsIgnoreCase("fixedline")){
			return new FixedlineFactory();
		}
		return null;
	}
}
