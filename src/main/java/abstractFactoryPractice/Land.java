package abstractFactoryPractice;

public class Land implements AbstractFactory{

	@Override
	public Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("lion")){
			return new Lion();
		}else if(animalType.equalsIgnoreCase("tiger")){
			return new Tiger();
		}
		return null;
	}

}
