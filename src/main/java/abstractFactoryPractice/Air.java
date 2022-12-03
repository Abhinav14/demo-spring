package abstractFactoryPractice;

public class Air implements AbstractFactory{

	@Override
	public Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("eagle")){
			return new Eagle();
		}else if(animalType.equalsIgnoreCase("owl")){
			return new Owl();
		}
		return null;
	}

}
