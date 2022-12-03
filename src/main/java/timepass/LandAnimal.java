package timepass;

public class LandAnimal extends AbstractFactory{

	@Override
	Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("lion")){
			return new Lion();
		}else if(animalType.equalsIgnoreCase("tiger")){
			return new Tiger();
		}
		return null;
	}

}
