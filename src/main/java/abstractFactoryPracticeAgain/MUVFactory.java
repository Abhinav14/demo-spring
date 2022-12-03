package abstractFactoryPracticeAgain;

public class MUVFactory implements AbstractFactory{

	@Override
	public Vehicle getVehicle(String vehicleName) {
		if(vehicleName.equalsIgnoreCase("innova")){
			return new Innova();
		}else if(vehicleName.equalsIgnoreCase("hexa")){
			return new Hexa();
		}
		return null;
	}

}
