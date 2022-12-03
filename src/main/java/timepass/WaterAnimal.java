package timepass;

public class WaterAnimal extends AbstractFactory{

	@Override
	Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("orca")){
			return new Orca();
		}else if(animalType.equalsIgnoreCase("seal")){
			return new Seal();
		}
		return null;
	}
	
}
