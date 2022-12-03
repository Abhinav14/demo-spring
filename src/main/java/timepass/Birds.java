package timepass;

public class Birds extends AbstractFactory{

	@Override
	Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("eagle")){
			return new Eagle();
		}
		return null;
	}

}
