package abstractFactoryPracticeAgain;

public class FactoryProducer {
	public static AbstractFactory getVehicleType(String vehicleType){
		if(vehicleType.equalsIgnoreCase("sedan")){
			return new SedanFactory();
		}else if(vehicleType.equalsIgnoreCase("muv")){
			return new MUVFactory();
		}
		return null;
	}
}
