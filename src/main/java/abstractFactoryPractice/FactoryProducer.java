package abstractFactoryPractice;

public class FactoryProducer {
	public static AbstractFactory getFactory(String parentFactory){
		if(parentFactory.equalsIgnoreCase("land")){
			return new Land();
		}else if(parentFactory.equalsIgnoreCase("air")){
			return new Air();
		}else if(parentFactory.equalsIgnoreCase("water")){
			return new Water();
		}
		return null;
	}
}
