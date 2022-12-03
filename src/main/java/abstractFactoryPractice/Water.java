package abstractFactoryPractice;

public class Water implements AbstractFactory{

	@Override
	public Animal getAnimal(String animalType) {
		if(animalType.equalsIgnoreCase("shark")){
			return new Shark();
		}else if(animalType.equalsIgnoreCase("orca")){
			return new Orca();
		}
		return null;
	}

}
