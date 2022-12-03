package timepass;

public class FactoryProducer {
	public static AbstractFactory getFactory(String parentFactory){
		if(parentFactory.equalsIgnoreCase("land")){
			return new LandAnimal();
		}else if(parentFactory.equalsIgnoreCase("sky")){
			return new Birds();
		}else if(parentFactory.equalsIgnoreCase("water")){
			return new WaterAnimal();
		}
		return null;
	}
}
