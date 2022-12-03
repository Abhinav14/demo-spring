package abstractFactoryPracticeAgain;

public class SedanFactory implements AbstractFactory{

	@Override
	public Vehicle getVehicle(String vehicleName) {
		if(vehicleName.equalsIgnoreCase("verna")){
			return new Verna();
		}else if(vehicleName.equalsIgnoreCase("city")){
			return new City();
		}
		return null;
	}

}
